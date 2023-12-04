package app.transbus.Controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;

import java.io.IOException;

public class ServicioController {
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
    @FXML
    private TabPane tabPane;

    public void initialize() {
        tabPane.getSelectionModel().select(0); // Selecciona el segundo tab
    }

    @FXML
    void onClick(Event event) {

        if(tabPane.getSelectionModel().getSelectedIndex() == 0) {
            tabPane.getSelectionModel().selectNext();
        } else {
            tabPane.getSelectionModel().selectPrevious();
        }

    }

    public void loadIns(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/insServicio.fxml"));
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
