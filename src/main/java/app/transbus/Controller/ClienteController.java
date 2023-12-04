package app.transbus.Controller;

import dto.BusBrandDTO;
import dto.CustomerDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.ServicesLocator;

import java.io.IOException;
import java.sql.SQLException;

public class ClienteController {

    @FXML
    private TableView<CustomerDTO> tablaCliente;

    @FXML
    private TableColumn<CustomerDTO, String> idClienteColumn;

    @FXML
    private TableColumn<CustomerDTO, String> nombreClienteColumn;

    @FXML
    private TableColumn<CustomerDTO, String> apellidosClienteColumn;

    @FXML
    private TableColumn<CustomerDTO, String> paisClienteColumn;


    @FXML
    public void initialize() throws SQLException, ClassNotFoundException {
        idClienteColumn.setStyle("-fx-alignment: CENTER;");
        nombreClienteColumn.setStyle("-fx-alignment: CENTER;");
        apellidosClienteColumn.setStyle("-fx-alignment: CENTER;");
        paisClienteColumn.setStyle("-fx-alignment: CENTER;");
        chargeData();
    }

    private void chargeData () throws ClassNotFoundException, SQLException{
        idClienteColumn = new TableColumn<CustomerDTO, String>("Número de Identidad");
        idClienteColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerIdNumber"));

        nombreClienteColumn = new TableColumn<CustomerDTO, String>("Nombre");
        nombreClienteColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerName"));

        apellidosClienteColumn = new TableColumn<CustomerDTO, String>("Apellidos");
        apellidosClienteColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerSurnames"));

        paisClienteColumn = new TableColumn<CustomerDTO, String>("País");
        paisClienteColumn.setCellValueFactory(new PropertyValueFactory<>("CustomerCountry"));

        tablaCliente.getColumns().clear();
        tablaCliente.getColumns().addAll(idClienteColumn, nombreClienteColumn, apellidosClienteColumn, paisClienteColumn);

        ObservableList<CustomerDTO> listaClientes = FXCollections.observableArrayList(ServicesLocator.getInstance().getTransBusServices().getCustomerList());
        tablaCliente.setItems(listaClientes);

        int i = 0;
        System.out.println(listaClientes.get(i).getCustomerName());
        System.out.println(listaClientes.get(i).getCustomerSurnames());
        System.out.println(listaClientes.get(i).getCustomerCountry());
        System.out.println(listaClientes.get(i).getCustomerIdNumber());

    }

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/transbus/insCliente.fxml"));
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
