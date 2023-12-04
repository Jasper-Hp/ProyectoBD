package services;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class CustomerServices {
    public void insertCustomer(int idCustomer, String customerName, String customerCountry, String customerSurnames, String customerIdNumber) throws SQLException, ClassNotFoundException {
        String function = "{call insert_customer(?, ?, ?, ?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idCustomer);
        preparedFunction.setString(2, customerName);
        preparedFunction.setString(3, customerCountry);
        preparedFunction.setString(4, customerSurnames);
        preparedFunction.setString(5, customerIdNumber);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public void updateCustomer(int idCustomer, String customerName, String customerCountry, String customerSurnames, String customerIdNumber) throws SQLException, ClassNotFoundException {
        String function = "{call update_customer(?, ?, ?, ?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idCustomer);
        preparedFunction.setString(2, customerName);
        preparedFunction.setString(3, customerCountry);
        preparedFunction.setString(4, customerSurnames);
        preparedFunction.setString(5, customerIdNumber);

        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public void deleteCustomer(int idCustomer) throws SQLException, ClassNotFoundException {
        String function = "{call delete_customer(?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idCustomer);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }
}
