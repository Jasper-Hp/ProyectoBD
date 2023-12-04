package app.transbus.Controller;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


import java.io.IOException;
import java.net.StandardSocketOptions;

public class TransBusResponsiveController {

    @FXML
    private VBox menu;
    @FXML
    private Button btnCarros;
    @FXML
    private Label pa;
    @FXML
    private ImageView hamburgo;
    private boolean isMenuHidden = true;


        @FXML private AnchorPane root;

        @FXML private BorderPane contentArea;
        @FXML private BorderPane contentAreaChiquita;


    @FXML
    private void vaciar() {
            contentAreaChiquita.getChildren().clear();
            loadMenu();
    }
    // ...


    @FXML
    private void loadMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/hello-view.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentArea.getChildren().clear();
            contentArea.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   @FXML
    void toggleMenu() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), menu);

        if (isMenuHidden) {
            // Si el menú está oculto, mostrarlo
            //loadCarFXMLChiquita();
            transition.setToX(0);
        } else {
            // Si el menú está visible, ocultarlo
           // loadCarFXML();
            transition.setToX(-menu.getWidth());
        }

        // Invertir el estado de visibilidad del menú
        isMenuHidden = !isMenuHidden;

        transition.play();
    }

    // ...


    @FXML
    private void loadGestion() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/gestion1.fxml"));
            AnchorPane carPane = loader.load();
            //toggleMenu();
            contentAreaChiquita.getChildren().clear();
            contentAreaChiquita.getChildren().add(carPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


