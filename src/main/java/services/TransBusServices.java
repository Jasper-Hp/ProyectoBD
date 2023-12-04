package services;

import dto.BusBrandDTO;
import dto.CustomerDTO;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TransBusServices {
    public ArrayList<BusBrandDTO> getBusBrandList() throws SQLException, ClassNotFoundException {
        ArrayList<BusBrandDTO> busBrandList = new ArrayList<>();
        String function = "{call get_all_bus_brands()}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        boolean hasResults = preparedFunction.execute();
        while (hasResults) {
            ResultSet resultSet = preparedFunction.getResultSet();
            while (resultSet.next()){
                BusBrandDTO busBrand = new BusBrandDTO(resultSet.getInt("id_brand"), resultSet.getString("brand_name"),
                        resultSet.getInt("chairs_count"), resultSet.getFloat("fuel_consumption"),
                        resultSet.getString("fuel_type"));
                busBrandList.add(busBrand);
            }
            resultSet.close();
            hasResults = preparedFunction.getMoreResults();
        }
        preparedFunction.close();
        connection.close();

        return busBrandList;
    }

    public ArrayList<CustomerDTO> getCustomerList() throws SQLException, ClassNotFoundException {
        ArrayList<CustomerDTO> customerList = new ArrayList<>();
        String function = "{call get_all_customers()}";
        java.sql.Connection connection = ServicesLocator.getConnection();
        CallableStatement preparedFunction = connection.prepareCall(function);
        boolean hasResults = preparedFunction.execute();
        while (hasResults) {
            ResultSet resultSet = preparedFunction.getResultSet();
            while (resultSet.next()){
                CustomerDTO customer = new CustomerDTO(resultSet.getInt("id_customer"),
                        resultSet.getString("customer_name"),
                        resultSet.getString("customer_country"),
                        resultSet.getString("customer_surnames"),
                        resultSet.getString("customer_id_number"));
                customerList.add(customer);
            }
            resultSet.close();
            hasResults = preparedFunction.getMoreResults();
        }
        preparedFunction.close();
        connection.close();

        return customerList;
    }
}
