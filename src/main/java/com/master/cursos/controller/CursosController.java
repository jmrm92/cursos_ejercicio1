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

    /**
    * Recupera una lista de cursos.
    *
    * @return         	una lista de cursos
    */
    @GetMapping (value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos () {
        return service.cursos();
    }

    /**
    * Recupera un objeto Curso por su codCurso.
    *
    * @param  codCurso  el codCurso del Curso que se va a recuperar
    * @return           el objeto Curso con el codCurso especificado
    */
    @GetMapping (value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso (@PathVariable ("codCurso") int codCurso) {
        return service.buscarCurso(codCurso);
    }
    
    /**
    * Crea un nuevo curso utilizando el objeto de curso proporcionado.
    *
    * @param  curso  el objeto de curso a crear
    * @return        void
    */
    @PostMapping (value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso (@RequestBody Curso curso) {
        service.altaCurso(curso);
    }

    /**
    * Elimina un curso de la base de datos.
    *
    * @param  codCurso  el código del curso que se va a eliminar
    * @return           la lista de cursos después de la eliminación
    */
    @DeleteMapping (value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso (@PathVariable ("codCurso") int codCurso) {
        return service.eliminarCurso(codCurso);
    }

    /**
    * Actualiza la duración de un curso.
    *
    * @param  codCurso    el código del curso a actualizar
    * @param  duracion    la nueva duración del curso
    *
    */
    @PutMapping (value = "/{codCurso}/{duracion}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarCurso (@PathVariable ("codCurso") int codCurso, @PathVariable ("duracion") int duracion) {
        Curso curso = service.buscarCurso(codCurso);
        curso.setDuracion(duracion);
        service.actualizarCurso(curso);
    }  

    /**
    * Recupera una lista de objetos Curso que se encuentren dentro del rango de precios especificado.
    *
    * @param  precioMinimo  el valor mínimo de precio para filtrar
    * @param  precioMaximo  el valor máximo de precio para filtrar
    * @return               una lista de objetos Curso dentro del rango de precios especificado
    */
    @GetMapping (value = "/{precioMinimo}/{precioMaximo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> filtrarPorPrecio (@PathVariable ("precioMinimo") double precioMinimo,@PathVariable ("precioMaximo") double precioMaximo) {
        return service.cursoRangoPrecio (precioMinimo, precioMaximo);
    }

}
