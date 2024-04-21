package com.example.aplicacionherenciabiblio;

import com.example.aplicacionherenciabiblio.controllers.HelloController;
import com.example.aplicacionherenciabiblio.models.Biblioteca;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;


public class App extends Application {
    private static Biblioteca biblio = new Biblioteca();
    private static Stage stageView;
    private static Stage stageRoot;
    public static  Biblioteca getBiblio(){return biblio;}
    public static void setBiblio(Biblioteca newBiblio){
        biblio = newBiblio;
    }
    @Override
    public void start(Stage stage) throws IOException {
        Stage stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        HelloController menuController = fxmlLoader.getController();
        menuController.init(stageRoot);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Biblioteca - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        Stage stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            Window stageRoot = null;
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}