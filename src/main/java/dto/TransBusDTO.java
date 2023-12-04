package dto;

import java.util.ArrayList;
import java.util.List;

public class TransBusDTO {
    private List<BusBrandDTO> brandList;
    private List<RequestDTO> requestList;
    private List<ServiceDTO> serviceList;
    private List<DriverDTO> driverList;

    public TransBusDTO() {
        this.brandList = new ArrayList<>();
        this.requestList = new ArrayList<>();
        this.serviceList = new ArrayList<>();
        this.driverList = new ArrayList<>();
    }

    public List<BusBrandDTO> getBrandList() {
        return brandList;
    }

    public List<RequestDTO> getRequestList() {
        return requestList;
    }

    public List<ServiceDTO> getServiceList() {
        return serviceList;
    }

    public List<DriverDTO> getDriverList() {
        return driverList;
    }
}
