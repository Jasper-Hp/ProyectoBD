package dto;

import java.time.LocalDate;

public class PlannedServiceDTO extends ServiceDTO{
    private int custReqNumber;
    private String pickupLocation;
    private LocalDate pickupTime;

    public PlannedServiceDTO(float plannedFuel, float plannedKm, String serviceName, char serviceType, int custReqNumber, String pickupLocation, LocalDate pickupTime) {
        super(plannedFuel, plannedKm, serviceName, serviceType);
        this.custReqNumber = custReqNumber;
        this.pickupLocation = pickupLocation;
        this.pickupTime = pickupTime;
    }
}
