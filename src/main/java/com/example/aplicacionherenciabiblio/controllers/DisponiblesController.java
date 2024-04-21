package com.example.aplicacionherenciabiblio.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.Biblioteca;
import com.example.aplicacionherenciabiblio.models.Libro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DisponiblesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> DisponiblesList;

    @FXML
    private Button MostrarButton;
    @FXML
    private Button AtrasButton;
    @FXML
    void OnMouseClickedAtrasButton(MouseEvent event) {
        Stage stage = (Stage) AtrasButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseClickedMostrarButton(MouseEvent event) {
        Biblioteca biblioteca = App.getBiblio();
        DisponiblesList.getItems().clear();

        ArrayList<Libro> librosDisponibles = biblioteca.getLibrosDisponibles();

        if (!librosDisponibles.isEmpty()) {
            DisponiblesList.getItems().add("Libros Disponibles: ");
            for (Libro libro : librosDisponibles){
                DisponiblesList.getItems().add(libro.toString()+", Contenido: " + libro.getContenido());
            }
        }else {
            DisponiblesList.getItems().add("No hay Libros disponibles en este momento.");
        }
    }

    @FXML
    void initialize() {
        assert DisponiblesList != null : "fx:id=\"DisponiblesList\" was not injected: check your FXML file 'disponibles-view.fxml'.";
        assert MostrarButton != null : "fx:id=\"MostrarButton\" was not injected: check your FXML file 'disponibles-view.fxml'.";
    }
}