package com.example.aplicacionherenciabiblio.models;
public class Libro {
    private String titulo;
    protected String autor;
    protected String editorial;
    protected int numPaginas;
    protected String contenido;
    protected boolean prestado;
    public Libro(String autor, String editorial, int numPaginas, String contenido) {
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.contenido = contenido;
        this.prestado = false;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public String getTitulo(){
        return titulo;
    }
    public boolean isPrestado(){
        return prestado;
    }
    public void prestar(){
        this.prestado = true;
    }
    public void devolver(){
        this.prestado = false;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Autor='" + autor + '\'' +
                ", Editorial='" + editorial + '\'' +
                ", NumPaginas=" + numPaginas +
                ", Contenido= " + contenido +
                '}';
    }
}