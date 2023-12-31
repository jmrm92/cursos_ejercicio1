package com.master.cursos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.master.cursos.model.Curso;

public interface CursosDao extends JpaRepository<Curso, Integer> {

    /**
    * Filtra los cursos por precio.
    *
    * @param precioMinimo  el precio mínimo para filtrar
    * @param precioMaximo  el precio máximo para filtrar
    * @return              una lista de cursos filtrados por precio
    */
     @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :precioMinimo AND :precioMaximo")
    List<Curso> filtrarPorPrecio(@Param("precioMinimo") Double precioMinimo, 
                                          @Param("precioMaximo") Double precioMaximo);
}
