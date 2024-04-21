package com.example.aplicacionherenciabiblio.models;

public class LibrosCantidad {
    private String titulo;
    private String nombreReceptor;
    private boolean prestado;

    public LibrosCantidad() {
    }

    public LibrosCantidad(String titulo, String nombreReceptor) {
        this.titulo = titulo;
        this.nombreReceptor = nombreReceptor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (prestado) {
            throw new IllegalStateException("El libro ya está prestado.");
        }
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LibrosCantidad other = (LibrosCantidad) obj;
        return titulo != null && titulo.equals(other.titulo);
    }

    @Override
    public int hashCode() {
        return titulo != null ? titulo.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CantidadLibros{" +
                "titulo='" + titulo + '\'' +
                ", nombreReceptor='" + nombreReceptor + '\'' +
                '}';
    }
}
