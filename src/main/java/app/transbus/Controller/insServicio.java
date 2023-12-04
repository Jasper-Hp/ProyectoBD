package app.transbus.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;

import java.io.IOException;

public class insServicio {
    @FXML
    private javafx.scene.layout.AnchorPane AnchorPane;
    @FXML
    private void loadServicio() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/servicio.fxml"));
            javafx.scene.layout.AnchorPane carPane = loader.load();
            //toggleMenu();
            AnchorPane.getChildren().clear();
            AnchorPane.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onAceptar(ActionEvent event) {

        // acción de aceptar

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notificación");
        alert.setHeaderText("Éxito");
        alert.setContentText("La acción se realizó satisfactoriamente.");

        alert.show();
        loadServicio();
    }
}
