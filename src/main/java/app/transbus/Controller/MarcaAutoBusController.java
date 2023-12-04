package app.transbus.Controller;

import dto.BusBrandDTO;
import javafx.beans.Observable;
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

import java.io.IOException;
import java.sql.SQLException;

public class MarcaAutoBusController {
    @FXML
    private TableView<BusBrandDTO> tablaMarcaAutobus;

    @FXML
    private TableColumn<BusBrandDTO, String> nombreColumn;

    @FXML
    private TableColumn<BusBrandDTO, Integer> asientosColumn;

    @FXML
    private TableColumn<BusBrandDTO, String> tipoCombustibleColumn;

    @FXML
    private TableColumn<BusBrandDTO, Float> consumoCombustibleColumn;

    @FXML private javafx.scene.layout.AnchorPane AnchorPane;
    @FXML
    public void initialize() throws SQLException, ClassNotFoundException {
        nombreColumn.setStyle("-fx-alignment: CENTER;");
        asientosColumn.setStyle("-fx-alignment: CENTER;");
        tipoCombustibleColumn.setStyle("-fx-alignment: CENTER;");
        consumoCombustibleColumn.setStyle("-fx-alignment: CENTER;");
        chargeData();
    }

    private void chargeData () throws ClassNotFoundException, SQLException{
        nombreColumn = new TableColumn<BusBrandDTO, String>("Nombre");
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("BrandName"));

        asientosColumn = new TableColumn<BusBrandDTO, Integer>("Cantidad de Asientos");
        asientosColumn.setCellValueFactory(new PropertyValueFactory<>("ChairsCount"));

        tipoCombustibleColumn = new TableColumn<BusBrandDTO, String>("Tipo de Combustible");
        tipoCombustibleColumn.setCellValueFactory(new PropertyValueFactory<>("FuelType"));

        consumoCombustibleColumn = new TableColumn<BusBrandDTO, Float>("Consumo de Combustible");
        consumoCombustibleColumn.setCellValueFactory(new PropertyValueFactory<>("FuelConsumption"));

        tablaMarcaAutobus.getColumns().clear();
        tablaMarcaAutobus.getColumns().addAll(nombreColumn, asientosColumn, consumoCombustibleColumn, tipoCombustibleColumn);

        ObservableList<BusBrandDTO> listBusBrand = FXCollections.observableArrayList(ServicesLocator.getInstance().getTransBusServices().getBusBrandList());
        tablaMarcaAutobus.setItems(listBusBrand);
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/insMarcaBus.fxml"));
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

