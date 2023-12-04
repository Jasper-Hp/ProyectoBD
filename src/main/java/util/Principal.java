package util;

import java.sql.*;

public class Principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DBConnection connection = new DBConnection("localhost", "transbus_control_db", "postgres", "postgres");

        Connection conex = connection.getConnection();

        String str = "SELECT * FROM car WHERE id_car = ?";
        PreparedStatement ps = conex.prepareStatement(str);
        ps.setInt(1, 2);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("aaaa");
            String id = rs.getString("id_car");
            String license_car = rs.getString("license_car");
            // replace "column2", "column3", etc. with your actual column names
            int fleet_number = rs.getInt("fleet_number");
            int id_brand = rs.getInt("id_brand");
            System.out.println("id_car: " + id + "license_car: " + license_car + ", id_brand: " + id_brand + ", fleet_number: " + fleet_number);
        }


    }
}

