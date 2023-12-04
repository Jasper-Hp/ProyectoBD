package services;

import java.sql.SQLException;

public class mainServices {
    public static void main (String[]args) throws SQLException, ClassNotFoundException {
        BusBrandServices b = new BusBrandServices();
        TransBusServices t = new TransBusServices();
        CarServices c = new CarServices();
        CustomerServices customer = new CustomerServices();

        //customer.insertCustomer("03123065776","Maria", "Machado Sosa", "Cuba");
        //customer.deleteCustomer(3);

        //c.insertCar("B254896", 4, 3);
        //c.deleteCar(4);
        //c.updateCar(6,"M547895", 4, 3);

        int i = t.getBusBrandList().size();
        int j = 0;
        while (i > 0) {
            System.out.println(t.getBusBrandList().get(j).getBrandName());
            j++;
            i--;
        }

        //c.insertCar("M421658", 10, 6);

        //b.deleteBusBrand(1);
        //b.insertBusBrand(5, "diesel", 8, "Hyundai");
        //b.updateBusBrand(6, 5, "diesel", 7, "Hyundai");
    }

}
