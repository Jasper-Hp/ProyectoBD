package app.transbus.Controller;

import dto.BusBrandDTO;
import dto.CarDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import services.ServicesLocator;
import services.TransBusServices;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutoController {

    @javafx.fxml.FXML
    private TableView<CarDTO> tablaAutos;
    @javafx.fxml.FXML
    private TableColumn<CarDTO, String> licenciaAutoColumn;
    @javafx.fxml.FXML
    private TableColumn<CarDTO, Integer> numeroFlotillaColumn;
    @FXML
    private TableColumn<CarDTO, String> marcaAutoColumn;

    @FXML
    private javafx.scene.layout.AnchorPane AnchorPane;
    @FXML
    public void initialize() throws SQLException, ClassNotFoundException {
        licenciaAutoColumn.setStyle("-fx-alignment: CENTER;");
        numeroFlotillaColumn.setStyle("-fx-alignment: CENTER;");
        marcaAutoColumn.setStyle("-fx-alignment: CENTER;");
        chargeData();
    }

    private void chargeData () throws ClassNotFoundException, SQLException{
        licenciaAutoColumn = new TableColumn<CarDTO, String>("Licencia");
        licenciaAutoColumn.setCellValueFactory(new PropertyValueFactory<>("LicenseCar"));

        numeroFlotillaColumn = new TableColumn<CarDTO, Integer>("Numero de Flotilla");
        numeroFlotillaColumn.setCellValueFactory(new PropertyValueFactory<>("FleetNumber"));

        marcaAutoColumn = new TableColumn<CarDTO, String>("Marca del Auto");
        marcaAutoColumn.setCellValueFactory(new PropertyValueFactory<>("BrandName"));

        tablaAutos.getColumns().clear();
        tablaAutos.getColumns().addAll(licenciaAutoColumn, numeroFlotillaColumn,marcaAutoColumn);

        ObservableList<CarDTO> listBusBrand = FXCollections.observableArrayList();

        for (BusBrandDTO b: ServicesLocator.getInstance().getTransBusServices().getBusBrandList()){
            ArrayList<CarDTO> carros = ServicesLocator.getInstance().getBusBrandServices().getCarListByBrand(b.getIdBrand());
            for (CarDTO carro : carros) {
                carro.setBrandName(b.getBrandName());
                listBusBrand.add(carro);
            }
        }

        tablaAutos.setItems(listBusBrand);
    }

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/insAutobus.fxml"));
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
