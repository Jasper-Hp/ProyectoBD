package dto;

public class RequestDTO {
    private int idRequest;
    CustomerDTO customer;
    SpecialServiceDTO specialService;
    CarDTO car;

    public RequestDTO(CustomerDTO customer, SpecialServiceDTO specialService, CarDTO car) {
        this.customer = customer;
        this.specialService = specialService;
        this.car = car;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public SpecialServiceDTO getSpecialService() {
        return specialService;
    }

    public void setSpecialService(SpecialServiceDTO specialService) {
        this.specialService = specialService;
    }

    public CarDTO getCar() {
        return car;
    }

    public void setCar(CarDTO car) {
        this.car = car;
    }

    public int getIdRequest() {
        return idRequest;
    }

}
