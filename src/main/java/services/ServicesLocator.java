package services;

import util.DBConnection;
import java.sql.SQLException;

public class ServicesLocator {
    private static ServicesLocator servicesLocator = null;
    private static TransBusServices transBusServices = null;
    private static BusBrandServices busBrandServices = null;
    private static CarServices carServices = null;
    private static CustomerServices customerServices = null;
    private static DriverServices driverServices = null;
    private static PermanentDriverServices permanentDriverServices = null;
    private PlannedServiceServices plannedServiceServices = null;
    private static RequestServices requestServices = null;
    private static ReserverDriverServices reserverDriverServices = null;
    private static RoadMapServices roadMapServices = null;
    private static ServicePerformedServices servicePerformedServices = null;
    private static ServiceServices serviceServices = null;
    private static SpecialServiceServices specialServiceServices = null;
    private static TouristGroupServices touristGroupServices = null;

    public static ServicesLocator getInstance(){
        if(servicesLocator == null){
            servicesLocator = new ServicesLocator();
        }
        return servicesLocator;
    }

    public static TransBusServices getTransBusServices(){
        if(transBusServices == null){
            transBusServices = new TransBusServices();
        }
        return transBusServices;
    }

    public static BusBrandServices getBusBrandServices(){
        if(busBrandServices == null){
            busBrandServices = new BusBrandServices();
        }
        return busBrandServices;
    }

    public static CarServices getCarServices(){
        if(carServices == null){
            carServices = new CarServices();
        }
        return carServices;
    }

    public static CustomerServices getCustomerServices(){
        if(customerServices == null){
            customerServices = new CustomerServices();
        }
        return customerServices;
    }

    public static DriverServices getDriverServices(){
        if(driverServices == null){
            driverServices = new DriverServices();
        }
        return driverServices;
    }

    public static PermanentDriverServices getPermanentDriverServices(){
        if(permanentDriverServices == null){
            permanentDriverServices = new PermanentDriverServices();
        }
        return permanentDriverServices;
    }

    public PlannedServiceServices getPlannedServiceServices(){
        if(plannedServiceServices == null){
            plannedServiceServices = new PlannedServiceServices();
        }
        return plannedServiceServices;
    }

    public RequestServices getRequestServices(){
        if(requestServices == null){
            requestServices = new RequestServices();
        }
        return requestServices;
    }

    public ReserverDriverServices getReserverDriverServices(){
        if(reserverDriverServices == null){
            reserverDriverServices = new ReserverDriverServices();
        }
        return reserverDriverServices;
    }

    public RoadMapServices getRoadMapServices(){
        if(roadMapServices == null){
            roadMapServices = new RoadMapServices();
        }
        return roadMapServices;
    }

    public ServicePerformedServices getServicePerformedServices(){
        if(servicePerformedServices == null){
            servicePerformedServices = new ServicePerformedServices();
        }
        return servicePerformedServices;
    }

    public ServiceServices getServiceServices(){
        if(serviceServices == null){
            serviceServices = new ServiceServices();
        }
        return serviceServices;
    }

    public static SpecialServiceServices getSpecialServiceServices(){
        if (specialServiceServices == null){
            specialServiceServices = new SpecialServiceServices();
        }
        return specialServiceServices;
    }

    public static TouristGroupServices getTouristGroupServices(){
        if(touristGroupServices == null){
            touristGroupServices = new TouristGroupServices();
        }
        return touristGroupServices;
    }

    public static java.sql.Connection getConnection(){
        DBConnection connection = null;
        try {
            connection = new DBConnection("localhost", "transbus_control_db", "postgres", "123");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection.getConnection();
    }
}
