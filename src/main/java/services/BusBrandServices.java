package services;

import dto.CarDTO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

public class BusBrandServices {

    public void insertBusBrand(int chairsCount, String fuelType, double fuelConsumption, String brandName) throws SQLException, ClassNotFoundException {
        String function = "{call insert_bus_brand(?, ?, ?, ?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, chairsCount);
        preparedFunction.setString(2, fuelType);
        preparedFunction.setDouble(3, fuelConsumption);
        preparedFunction.setString(4, brandName);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public void updateBusBrand(int idBrand, int chairsCount, String fuelType, double fuelConsumption, String brandName) throws SQLException, ClassNotFoundException {
        String function = "{call update_bus_brand(?, ?, ?, ?, ?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idBrand);
        preparedFunction.setInt(2, chairsCount);
        preparedFunction.setString(3, fuelType);
        preparedFunction.setDouble(4, fuelConsumption);
        preparedFunction.setString(5, brandName);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public void deleteBusBrand(int idBrand) throws SQLException, ClassNotFoundException {
        String function = "{call delete_bus_brand(?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        preparedFunction.setInt(1, idBrand);
        preparedFunction.execute();
        preparedFunction.close();
        connection.close();
    }

    public LinkedList<CarDTO> getCarList() throws SQLException, ClassNotFoundException {
        LinkedList<CarDTO> carList = new LinkedList<CarDTO>();
        String function = "{call get_all_cars()}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        boolean hasResults = preparedFunction.execute();
        while (hasResults) {
            ResultSet resultSet = preparedFunction.getResultSet();
            while (resultSet.next()){
                CarDTO car = new CarDTO(resultSet.getInt("id_car"), resultSet.getInt("fleet_number"),
                        resultSet.getString("license_car"));
                carList.add(car);
            }
            resultSet.close();
            hasResults = preparedFunction.getMoreResults();
        }
        preparedFunction.close();
        connection.close();

        return carList;
    }

    public ArrayList<CarDTO> getCarListByBrand(int brandId) throws SQLException, ClassNotFoundException {
        ArrayList<CarDTO> carList = new ArrayList<>();
        String function = "{call get_all_cars_by_brand(?)}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);

        // Establecer el parámetro de entrada
        preparedFunction.setInt(1, brandId);

        boolean hasResults = preparedFunction.execute();
        while (hasResults) {
            ResultSet resultSet = preparedFunction.getResultSet();
            while (resultSet.next()){
                CarDTO car = new CarDTO(resultSet.getInt("id_car"), resultSet.getInt("fleet_number"),
                        resultSet.getString("license_car"));
                carList.add(car);
            }
            resultSet.close();
            hasResults = preparedFunction.getMoreResults();
        }
        preparedFunction.close();
        connection.close();

        return carList;
    }




}
