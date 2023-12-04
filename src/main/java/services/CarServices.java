package services;

import dto.BusBrandDTO;
import dto.CarDTO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class CarServices {
    public void insertCar(String licenseCar, int fleet_number, int id_brand) throws SQLException, ClassNotFoundException {
        String function = "{call insert_car(?, ?, ?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setString(1, licenseCar);
        preparedFunction.setInt(2, fleet_number);
        preparedFunction.setInt(3, id_brand);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public void updateCar(int idCar, String licenseCar, int fleetNumber, int idBrand) throws SQLException, ClassNotFoundException {
        String function = "{call update_car(?, ?, ?, ?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idCar);
        preparedFunction.setString(2, licenseCar);
        preparedFunction.setInt(3, fleetNumber);
        preparedFunction.setInt(4, idBrand);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public void deleteCar(int idCar) throws SQLException, ClassNotFoundException {
        String function = "{call delete_car(?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idCar);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }
}
