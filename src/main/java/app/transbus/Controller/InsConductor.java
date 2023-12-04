package app.transbus.Controller;

import io.github.palexdev.materialfx.controls.MFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class InsConductor {

    @FXML
    private MFXRadioButton reserva;

    @FXML
    private MFXRadioButton regular;
    @FXML
    public void initialize() {

        ToggleGroup grupo = new ToggleGroup();

        reserva.setToggleGroup(grupo);
        regular.setToggleGroup(grupo);
        regular.isSelected();

//        popup = new MFXPopup();

    }


    @FXML
    private javafx.scene.layout.AnchorPane AnchorPane;
    @FXML
    private void loadConductor() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/conductor.fxml"));
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
        loadConductor();
    }

}
