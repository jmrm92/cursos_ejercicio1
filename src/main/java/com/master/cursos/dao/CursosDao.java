package com.master.cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.cursos.model.Curso;

public interface CursosDao extends JpaRepository<Curso, Integer> {
    
}
