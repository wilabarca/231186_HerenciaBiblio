package com.example.aplicacionherenciabiblio.models;

import java.util.ArrayList;

public class Biblioteca  {

    private ArrayList<Libro> listLibro = new ArrayList<>();
    private ArrayList<LibrosCantidad> listCantLibros = new ArrayList<>();
    public boolean addCant (LibrosCantidad cantidadLibros1){
        return listCantLibros.add(cantidadLibros1);
    }
    public boolean addLibros( Libro libro){
        return listLibro.add(libro);
    }

    public ArrayList<Libro> getListLibro() {
        return listLibro;
    }

    public void setListLibro(ArrayList<Libro> listLibro) {
        this.listLibro = listLibro;
    }

    public ArrayList<LibrosCantidad> getListCantLibros() {
        return listCantLibros;
    }

    public void setListCantLibros(ArrayList<LibrosCantidad> listCantLibros) {
        this.listCantLibros = listCantLibros;
    }
    public boolean hayLibrosDisponibles() {
        for (LibrosCantidad cantidadLibros : listCantLibros){
            if (!cantidadLibros.isPrestado()){
                return true;
            }
        }
        for (Libro libro : listLibro){
            if (!libro.isPrestado()){
                return true;
            }
        }
        return false;
    }
    public ArrayList<Libro> getLibrosDisponibles(){
        ArrayList<Libro> librosDisponibles = new ArrayList<>();
        for (Libro libro : listLibro){
            if (!libro.isPrestado()){
                librosDisponibles.add(libro);
            }
        }
        return librosDisponibles;
    }
}