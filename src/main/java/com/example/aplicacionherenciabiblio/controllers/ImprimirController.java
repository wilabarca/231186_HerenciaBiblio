package com.example.aplicacionherenciabiblio.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.Biblioteca;
import com.example.aplicacionherenciabiblio.models.Libro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ImprimirController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button MostrarButton;

    @FXML
    private ListView<String> listViewAll;

    @FXML
    private Button bttonView;

    @FXML
    void OnMouseClickedMostrarButton(MouseEvent event) {
        Biblioteca biblis = App.getBiblio();
        for (Libro periodico : biblis.getListLibro()){
             listViewAll.getItems().add(periodico.toString());
        }
    }

    @FXML
    void bttonView(MouseEvent event) {
        Stage stage = (Stage) bttonView.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        assert MostrarButton != null : "fx:id=\"MostrarButton\" was not injected: check your FXML file 'imprimir-view.fxml'.";
        assert listViewAll != null : "fx:id=\"listViewAll\" was not injected: check your FXML file 'imprimir-view.fxml'.";
        assert bttonView != null : "fx:id=\"bttonView\" was not injected: check your FXML file 'imprimir-view.fxml'.";

    }
}
