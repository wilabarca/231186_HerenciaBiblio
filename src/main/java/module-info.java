module com.example.aplicacionherenciabiblio {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.aplicacionherenciabiblio to javafx.fxml;
    opens com.example.aplicacionherenciabiblio.controllers to javafx.fxml; // Abre el paquete al módulo javafx.fxml

    exports com.example.aplicacionherenciabiblio;
}
