package app.transbus.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class insGrupoTuristico {
    @FXML
    private javafx.scene.layout.AnchorPane AnchorPane;
    @FXML
    private void loadGrupoTuristico() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/grupoTuristico.fxml"));
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
        loadGrupoTuristico();
    }
}
