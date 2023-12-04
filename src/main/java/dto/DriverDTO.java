package dto;

public class DriverDTO {
    protected int idDriver;
    protected String driverName;
    protected char driverType;
    protected String address;
    protected String district;
    protected String phoneNumber;

    public DriverDTO(String address, String district, String driverName, char driverType, String phoneNumber) {
        this.address = address;
        this.district = district;
        this.driverName = driverName;
        this.driverType = driverType;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public char getDriverType() {
        return driverType;
    }

    public void setDriverType(char driverType) {
        this.driverType = driverType;
    }

    public int getIdDriver() { return idDriver; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
