package com.example.aplicacionherenciabiblio.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.Biblioteca;
import com.example.aplicacionherenciabiblio.models.LibrosCantidad;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PrestadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listPrestado;

    @FXML
    private Button bttonVer;
    @FXML
    private Button AtrasButton;
    @FXML
    void OnMouseClickedAtrasButton(MouseEvent event) {
        Stage stage = (Stage) AtrasButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void bttonVer(MouseEvent event) {
        Biblioteca biblioteca = App.getBiblio();
        listPrestado.getItems().clear();

        if (biblioteca.getListLibro().isEmpty()){
            return;
        }
        for (LibrosCantidad imprimirs : biblioteca.getListCantLibros()){
            listPrestado.getItems().add(imprimirs.toString());
        }

    }

    @FXML
    void initialize() {
        assert listPrestado != null : "fx:id=\"listPrestado\" was not injected: check your FXML file 'prestados-view.fxml'.";
        assert bttonVer != null : "fx:id=\"bttonVer\" was not injected: check your FXML file 'prestados-view.fxml'.";

    }

}
