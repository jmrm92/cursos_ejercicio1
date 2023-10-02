package com.master.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping (value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos() {
        return service.cursos();
    }

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

    @PutMapping (value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarCurso (@RequestBody Curso curso) {
        service.actualizarCurso(curso);
    }  

}
