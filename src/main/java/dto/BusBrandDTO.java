package dto;

import java.util.ArrayList;
import java.util.List;

public class BusBrandDTO {
    private int idBrand;
    private String brandName;
    private int chairsCount;
    private float fuelConsumption;
    private String fuelType;
    private List<CarDTO> carList;
    private List<ReserverDriverDTO> reserverDriverList;

    public BusBrandDTO(int idBrand, String brandName, int chairsCount, float fuelConsumption, String fuelType) {
        this.idBrand = idBrand;
        this.brandName = brandName;
        this.chairsCount = chairsCount;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
        this.carList = new ArrayList<>();
        this.reserverDriverList = new ArrayList<>();
    }

    public List<CarDTO> getCarList(){
        return this.carList;
    }

    public void insertCar(CarDTO car){
        this.carList.add(car);
    }

    public List<ReserverDriverDTO> getReserverDriverList(){
        return this.reserverDriverList;
    }

    public void insertReserverDriver(ReserverDriverDTO reserverDriver){
        this.reserverDriverList.add(reserverDriver);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getChairsCount() {
        return chairsCount;
    }

    public void setChairsCount(int chairsCount) {
        this.chairsCount = chairsCount;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public int getIdBrand() {
        return idBrand;
    }

}
