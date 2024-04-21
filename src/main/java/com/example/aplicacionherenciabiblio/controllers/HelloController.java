package com.example.aplicacionherenciabiblio.controllers;

import com.example.aplicacionherenciabiblio.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button gerenteButton;

    @FXML
    private Button bibliotecarioButton;
    Stage callGerente = new Stage();
    Stage callBibliotecario = new Stage();

    @FXML
    void OnMouseClickedBibliotecarioButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("inicio-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callBibliotecario.setTitle("Biblioteca :" +"\"Bibliotecario\"");
        callBibliotecario.setScene(scene);
        callBibliotecario.show();
    }



    @FXML
    void OnMouseClickedGerenteButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Bibliotecario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callGerente.setTitle("Biblioteca :" + "\" " + "Bibliotecario" + "\"");
        callGerente.setScene(scene);
        callGerente.show();

    }

    Stage callPrestados = new Stage();
    @FXML
    public void OnMouseClickedPrestadosButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("prestados-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callPrestados.setTitle("Libros Prestados");
        callPrestados.setScene(scene);
        callPrestados.show();
    }
    Stage callDisponibles = new Stage();
    public void OnMouseClickedDisponiblesButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("disponibles-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callDisponibles.setTitle("Libros Disponibles");
        callDisponibles.setScene(scene);
        callDisponibles.show();
    }

    public void init(Stage stageRoot) {
    }
}
