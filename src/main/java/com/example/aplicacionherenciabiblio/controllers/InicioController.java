package com.example.aplicacionherenciabiblio.controllers;

import com.example.aplicacionherenciabiblio.App;
import com.example.aplicacionherenciabiblio.models.Biblioteca;
import com.example.aplicacionherenciabiblio.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class InicioController {
    private Usuario admin = new Usuario();
    @FXML
    private TextField UsuarioText;
    @FXML
    private PasswordField PassworText;
    Stage callMenu = new Stage();
    @FXML
    private ImageView closeWindow;
    private static Biblioteca biblio = new Biblioteca();
    private static Stage stageView;
    private static Stage stageRoot;
    public static Biblioteca getBiblio(){return biblio;}
    public static void setBiblio(Biblioteca newBiblio){ biblio = newBiblio;}
    @FXML
    private Button RegressButton;

    public void OnMouseClickIngresarButton(MouseEvent mouseEvent) {
        String Abarca1234 = PassworText.getText();
        Abarca1234 = UsuarioText.getText();

        if (Abarca1234.equals(admin.getUsuario()) && Abarca1234.equals(admin.getContrasena())) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Home-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                callMenu.setTitle("Menu / Menu");
                callMenu.setScene(scene);
                callMenu.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            mostrarAlertaError("Credenciales Incorrectas", "Porfavor verifica tu usuario y contraseña");
        }
    }
    @FXML
    void OnMouseClickedRegressButton(MouseEvent event) {
        Stage stage = (Stage) RegressButton.getScene().getWindow();
        stage.close();
    }

    public void init(Stage stageRoot) {
    }
    private void mostrarAlertaError(String titulo, String mensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}