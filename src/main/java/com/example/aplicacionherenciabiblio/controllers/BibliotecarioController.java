package com.example.aplicacionherenciabiblio.controllers;

import com.example.aplicacionherenciabiblio.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class BibliotecarioController {
    @FXML
    private Button DisponibleButton;

    @FXML
    private Button RegresarButton;

    @FXML
    void OnMouseCLickedRegresarButton(MouseEvent event) {
        Stage stage = (Stage) RegresarButton.getScene().getWindow();
        stage.close();
    }
    Stage callDisponible = new Stage();
    @FXML
    void OnMouseClickedDisponibleButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("disponibles-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callDisponible.setTitle("Biblioteca"+"\"Biblioteca Olimpo\"");
        callDisponible.setScene(scene);
        callDisponible.show();
    }
    Stage callAdd = new Stage();
    @FXML
    public void OnMouseClickedAddLibroButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Agregar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callAdd.setTitle("Añadir Libros");
        callAdd.setScene(scene);
        callAdd.show();

    }

    Stage callMostrar = new Stage();
    @FXML
    public void OnMouseClickedMostrarLibroButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("imprimir-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callMostrar.setTitle("Mostrar Libros");
        callMostrar.setScene(scene);
        callMostrar.show();
    }
    Stage callPrestar = new Stage();
    @FXML
    public void OnMouseClickedPrestarLibroButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(App.class.getResource("prestar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callPrestar.setTitle("Prestar Libros");
        callPrestar.setScene(scene);
        callPrestar.show();
    }
    Stage callPrestados = new Stage();
    public void OnMouseClickedPrestadosButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(App.class.getResource("prestados-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callPrestados.setTitle("Prestar Libros");
        callPrestados.setScene(scene);
        callPrestados.show();
    }
}
