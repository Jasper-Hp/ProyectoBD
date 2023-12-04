package dto;

public class ServiceDTO {
    protected int idService;
    protected String serviceName;
    protected char serviceType;
    protected float plannedFuel;
    protected float plannedKm;

    public ServiceDTO(float plannedFuel, float plannedKm, String serviceName, char serviceType) {
        this.plannedFuel = plannedFuel;
        this.plannedKm = plannedKm;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getIdService() {
        return idService;
    }

    public float getPlannedFuel() {
        return plannedFuel;
    }

    public void setPlannedFuel(float plannedFuel) {
        this.plannedFuel = plannedFuel;
    }

    public float getPlannedKm() {
        return plannedKm;
    }

    public void setPlannedKm(float plannedKm) {
        this.plannedKm = plannedKm;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public char getServiceType() {
        return serviceType;
    }

    public void setServiceType(char serviceType) {
        this.serviceType = serviceType;
    }
}
