package com.example.aplicacionherenciabiblio.models;

public class Cuentos extends Libro {
  private String contenido;

  public Cuentos(String autor, String editorial, int numPaginas, String contenido) {
    super(autor, editorial, numPaginas, contenido);
    this.contenido = contenido;
  }
  public String getContenido(){
    return contenido;
  }
  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  @Override
  public String toString() {
    return "Periodico{" +
            "contenido='" + contenido + '\'' +
            ", autor='" + autor + '\'' +
            ", editorial='" + editorial + '\'' +
            ", numPaginas=" + numPaginas +
            '}';
  }
}
