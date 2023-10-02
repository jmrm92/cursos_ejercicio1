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
    @Override
    public List<Curso> cursos() {
        return dao.findAll();
    }

    @Override
    public Curso buscarCurso(int codCurso) {
        return dao.findById(codCurso).orElse(null);
    }

    @Override
    public void altaCurso(Curso curso) {
        dao.save(curso);
    }

    @Override
    public void actualizarCurso(Curso curso) {
        dao.save(curso);
    }

    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        dao.deleteById(codCurso);
        return dao.findAll();
    }

    @Override
    public List<Curso> filtrarPorPrecio(double precio1, double precio2) {
        
    }
    
}
