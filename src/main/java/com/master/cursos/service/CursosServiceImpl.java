package com.master.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.cursos.dao.CursosDao;
import com.master.cursos.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {
    
    @Autowired
    private CursosDao dao;
 
    /**
    * Una descripción de toda la función en Java.
    *
    * @param  codCurso   descripción del parámetro
    * @return             descripción del valor de retorno
    */
    @Override
    public Curso buscarCurso(int codCurso) {
        return dao.findById(codCurso).orElse(null);
    }


    /**
    * Descripción de la función Java completa.
    *
    * @param  curso  descripción del parámetro
    * @return        descripción del valor de retorno
    */
    @Override
    public List<Curso> altaCurso(Curso curso) {
        dao.save(curso);
        return dao.findAll();
    }


    /**
    * Actualiza un curso en el sistema.
    *
    * @param  curso  el objeto de curso a actualizar
    * @return        void
    */
    @Override
    public void actualizarCurso(Curso curso) {
        dao.save(curso);
    }

    /**
    * Descripción de toda la función en Java.
    *
    * @param  codCurso   descripción del parámetro
    * @return            descripción del valor de retorno
    */
    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        dao.deleteById(codCurso);
        return dao.findAll();
    }

    /**
    * Retorna una lista de objetos Curso basados en el rango de precios dado.
    *
    * @param  precioMinimo  el precio mínimo para filtrar
    * @param  precioMaximo  el precio máximo para filtrar
    * @return               una lista de objetos Curso que se encuentran dentro del rango de precios dado
    */
    @Override
    public List<Curso> cursoRangoPrecio(double precioMinimo, double precioMaximo) {
        return dao.filtrarPorPrecio(precioMinimo, precioMaximo);
    }


    /**
    * Devuelve una lista de objetos Curso.
    *
    * @return  una lista de objetos Curso
    */
    @Override
    public List<Curso> cursos() {
        return dao.findAll();
    }

    
}
