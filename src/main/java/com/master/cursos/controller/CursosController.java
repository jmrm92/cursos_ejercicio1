package com.master.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.cursos.model.Curso;
import com.master.cursos.service.CursosService;

@RestController
public class CursosController {

    @Autowired
    CursosService service;

    @GetMapping (value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso (int codCurso) {
        return service.buscarCurso(codCurso);
    }
    
    @PostMapping (value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso (@RequestBody Curso curso) {
        service.altaCurso(curso);
    }

    @DeleteMapping (value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso (int codCurso) {
        return service.eliminarCurso(codCurso);
    }

    @PutMapping (value = "/{codCurso}/{duracion}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarCurso (@PathVariable int codCurso, @PathVariable int duracion) {
        Curso curso = service.buscarCurso(codCurso);
        curso.setDuracion(duracion);
        service.actualizarCurso(curso);
    }  

    @GetMapping (value = "/{precioMinimo}/{precioMaximo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> filtrarPorPrecio (@PathVariable double precioMinimo,@PathVariable double precioMaximo) {
        return service.cursoRangoPrecio (precioMinimo, precioMaximo);
    }

}
