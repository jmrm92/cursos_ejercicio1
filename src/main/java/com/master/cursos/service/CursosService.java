package com.master.cursos.service;

import java.util.List;

import com.master.cursos.model.Curso;

public interface CursosService{
    List<Curso> cursos();
    Curso buscarCurso (int codCurso);
    List<Curso> altaCurso(Curso curso);
    void actualizarCurso(Curso curso);
    List<Curso> eliminarCurso(int codCurso);
    List<Curso> cursoRangoPrecio(double precioMinimo, double precioMaximo);
}
