package app.transbus.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class GestionController {
    public VBox VboxGrupoTuristico;
    public VBox VboxServicioRealizado;
    public VBox VboxSolicitud;
    @FXML
    private BorderPane  contentAreaChiquita;
    @FXML
    private Button btnCliente;
    @FXML
    private Button btnHojaRuta;
    @FXML
    private Button btnSolicitudes;
    @FXML
    private void loadautoBus() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/marcaAutobus.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void loadauto() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/auto.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadCliente() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/cliente.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadHojaRuta() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/hojaRuta.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void loadSolicitudes() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/solicitud.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void loadConductores() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/conductor.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    @FXML
    private void loadGrupoTuristico() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/grupoTuristico.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void loadServicioRealizado() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/servicioRealizado.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadServicio() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/servicio.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
