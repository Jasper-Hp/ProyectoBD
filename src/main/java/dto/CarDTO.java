package dto;

import java.util.ArrayList;
import java.util.List;

public class CarDTO {
    private int idCar;
    private int fleetNumber;
    private String licenseCar;

    private String brandName;
    private List<PermanentDriverDTO> permanentDriverList;
    private List<RoadMapDTO> roadMapList;

    public CarDTO(int idCar, int fleetNumber, String licenseCar) {
        this.idCar = idCar;
        this.fleetNumber = fleetNumber;
        this.licenseCar = licenseCar;
        this.permanentDriverList = new ArrayList<>();
        this.roadMapList = new ArrayList<>();
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public List<PermanentDriverDTO> getPermanentDriverList(){
        return this.permanentDriverList;
    }

    public void insertPermanentDriver(PermanentDriverDTO permanentDriver){
        this.permanentDriverList.add(permanentDriver);
    }

    public List<RoadMapDTO> getRoadMapList(){
        return this.roadMapList;
    }

    public void insertRoadMap (RoadMapDTO roadMap){
        this.roadMapList.add(roadMap);
    }

    public int getIdCar() {
        return idCar;
    }

    public int getFleetNumber() {
        return fleetNumber;
    }

    public void setFleetNumber(int fleetNumber) {
        this.fleetNumber = fleetNumber;
    }

    public String getLicenseCar() {
        return licenseCar;
    }

    public void setLicenseCar(String licenseCar) {
        this.licenseCar = licenseCar;
    }
}
