package app.transbus.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ServicioRealizadoController {
    @FXML
    private javafx.scene.layout.AnchorPane AnchorPane;
    @FXML
    private void loadGestion() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/gestion1.fxml"));
            javafx.scene.layout.AnchorPane carPane = loader.load();
            //toggleMenu();
            AnchorPane.getChildren().clear();
            AnchorPane.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadIns(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/insServicioRealizado.fxml"));
            javafx.scene.layout.AnchorPane carPane = loader.load();
            //toggleMenu();
            AnchorPane.getChildren().clear();
            AnchorPane.getChildren().add(carPane);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
