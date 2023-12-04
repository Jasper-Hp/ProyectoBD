package app.transbus.Controller;

import io.github.palexdev.materialfx.controls.MFXPopup;
import io.github.palexdev.materialfx.controls.MFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class insMarcaAutobus {

    public static final MFXRadioButton R1 = null;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button btnAceptar;
    @FXML
    private MFXRadioButton gasolinaRadio;

    @FXML
    private MFXRadioButton dieselRadio;
    @FXML
    private MFXPopup popup ;


    @FXML
    public void initialize() {

        ToggleGroup grupo = new ToggleGroup();

        gasolinaRadio.setToggleGroup(grupo);
        dieselRadio.setToggleGroup(grupo);
        dieselRadio.isSelected();

//        popup = new MFXPopup();

    }

    @FXML
    private void loadMarcaAutoBus() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/marcaAutoBus.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            AnchorPane.getChildren().clear();
            AnchorPane.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void aceptar (){
        // logica para añadir
        // mensaje de que se añadio exitosamente
//mostrarPopup("marca agregasdad sds");


        loadMarcaAutoBus();

    }
//    public void mostrarPopup(String msg) {
////        popup.show("ELEMENTO INSERTADO"); // Titulo
//
//        // Contenido
//        VBox content = new VBox();
//        content.setAlignment(Pos.CENTER);
//        content.setSpacing(10);
//        content.setPrefSize(300, 150);
//        content.setStyle("-fx-background-color: black; -fx-text-fill: white;");
//
//        content.getChildren().add(new Label(msg));
//        popup.setContent(content);
//
//        // Ocultar luego de x segs
//        PauseTransition delay = new PauseTransition(Duration.seconds(3));
//        delay.setOnFinished(event -> popup.hide());
//        delay.play();
//    }

    @FXML
    private void onAceptar(ActionEvent event) {

        // acción de aceptar

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notificación");
        alert.setHeaderText("Éxito");
        alert.setContentText("La acción se realizó satisfactoriamente.");

        alert.show();
        loadMarcaAutoBus();
    }



}