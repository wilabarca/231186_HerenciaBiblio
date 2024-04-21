package com.example.aplicacionherenciabiblio.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.Biblioteca;
import com.example.aplicacionherenciabiblio.models.Libro;
import com.example.aplicacionherenciabiblio.models.Cuentos;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarController {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField textConten;
    @FXML
    private TextField NameAutorButton;
    @FXML
    private TextField EditorialButton;
    @FXML
    private TextField PagButton;
    @FXML
    private Button guardarButon;
    @FXML
    private Button OtroLibro;
    @FXML
    private Button RegresarButton;
    @FXML
    void OnMouseClicked(MouseEvent event) {
    }

    @FXML
    void OnMouseClickedNameAutorButton(MouseEvent event) {
    }

    @FXML
    void OnMouseClickedNameBookButton(MouseEvent event) {
    }

    Stage callOtro = new Stage();

    @FXML
    void OnMouseClickedOtroLibro(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Agregar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callOtro.setTitle("Biblioteca" + "\"Biblioteca Olimpo\"");
        callOtro.setScene(scene);
        callOtro.show();

        Stage stage = (Stage) OtroLibro.getScene().getWindow();
        stage.close();
    }
    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) {
        Stage stage = (Stage) RegresarButton.getScene().getWindow();
        stage.close();
    }


    @FXML
    void guardarbuton(MouseEvent event) {
        try {
            String nombre = NameAutorButton.getText();
            String editorial = EditorialButton.getText();
            String contenido = textConten.getText();
            int numPag = Integer.parseInt(PagButton.getText());

            Biblioteca biblioteca = App.getBiblio();

            if (existeLibro(nombre, editorial, numPag, contenido)) {
                showAlert("Error", "Ya existe un libro con los mismos datos");
            } else {
                Cuentos periodico = new Cuentos(nombre, editorial, numPag, contenido);
                App.getBiblio().addLibros(periodico);
                showAlert("Libro", " agregado correctamente a la lista.");
            }
        } catch (NumberFormatException e) {
            showAlert("Error", " al convertir el número de páginas a entero: " + e.getMessage());
        } catch (Exception e) {
            showAlert("Error", " Error al agregar el libro a la lista, ya existe el Libro");
        }
    }
    public boolean existeLibro(String autor, String editorial, int numPaginas, String contenido) {
        for (Libro libro : App.getBiblio().getListLibro()) {
            if (libro.getAutor().equals(autor)
                    && libro.getEditorial().equals(editorial)
                    && libro.getNumPaginas() == numPaginas
                    && libro.getContenido().equals(contenido)) {
                return true;
            }
        }
        return false;
    }

    @FXML
    void pagButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

}