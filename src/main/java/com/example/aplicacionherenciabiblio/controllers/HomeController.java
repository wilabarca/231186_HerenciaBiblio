package com.example.aplicacionherenciabiblio.controllers;

import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private PasswordField ContraseñaText;
    @FXML
    private Button SalirButton;

    @FXML
    private TextField UsserText;
    private Usuario admin = new Usuario();
    @FXML
    private Button SiguienteButton;

    Stage callEntrar = new Stage();

    @FXML
    void OnMouseClickedSalirButton(MouseEvent event) {
        Stage stage = (Stage) SalirButton.getScene().getWindow();
        stage.close();
    }


    public void OnMouseClickedSiguienteButton(MouseEvent mouseEvent) throws IOException {
        String Abarca1234 = ContraseñaText.getText();
        Abarca1234 = UsserText.getText();

        if (Abarca1234.equals(admin.getUsuario1()) && Abarca1234.equals(admin.getContrasena1())) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Home-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                callEntrar.setTitle("Biblioteca :" + "\"" + " Menu" + "\"");
                callEntrar.setScene(scene);
                callEntrar.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            mostrarAlertaError("Credenciales Incorrectas","Porfavor verifica tu usuario y contraseña");
        }
    }

    private void mostrarAlertaError(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}