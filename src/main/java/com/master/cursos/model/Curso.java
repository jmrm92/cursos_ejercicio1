package com.master.cursos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "cursos")
public class Curso {

    @Id
    @Column (name = "cod_curso")
    private int codCurso;
    private String nombre;
    private int duracion;
    private double precio;
    
    public Curso() {
    }

    public Curso(int codCurso, String nombre, int duracion, double precio) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codCurso;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codCurso != other.codCurso)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio
                + "]";
    }

    
}
