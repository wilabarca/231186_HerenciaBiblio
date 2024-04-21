package com.example.aplicacionherenciabiblio.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.LibrosCantidad;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PrestarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textTitle;

    @FXML
    private Button bttonSave;

    @FXML
    private TextField textReceptor;

    @FXML
    private Button RetrocesoButton;

    @FXML
    void OnMouseClickedRetrocesoButton(MouseEvent event) {
        Stage stage = (Stage) RetrocesoButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void bttonSave(MouseEvent event) {
        String titulo = textTitle.getText();
        String names = textReceptor.getText();

        if (titulo.isEmpty() || names.isEmpty()) {
            ViewAlert("Error", "Deben llenarse todos los campos.");
        } else {
            LibrosCantidad cantidadLibros = new LibrosCantidad(titulo, names);
            App.getBiblio().addCant(cantidadLibros);
            showAlert("Éxito", "El libro se ha prestado con éxito.");
        }
    }
    private void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    private void ViewAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    void initialize() {
        assert textTitle != null : "fx:id=\"textTitle\" was not injected: check your FXML file 'prestar-view.fxml'.";
        assert bttonSave != null : "fx:id=\"bttonSave\" was not injected: check your FXML file 'prestar-view.fxml'.";
        assert textReceptor != null : "fx:id=\"textReceptor\" was not injected: check your FXML file 'prestar-view.fxml'.";

    }
}