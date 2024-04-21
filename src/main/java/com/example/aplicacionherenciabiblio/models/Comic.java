package com.example.aplicacionherenciabiblio.models;

public class Comic extends Libro{
   private String tema;

    public Comic(String autor, String editorial, int numPaginas, String tema) {
        super(autor, editorial, numPaginas, "");
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "tema='" + tema + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

