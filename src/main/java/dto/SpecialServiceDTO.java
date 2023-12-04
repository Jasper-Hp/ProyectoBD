package dto;

import java.time.LocalDate;

public class SpecialServiceDTO extends ServiceDTO{
    private int contractNumber;
    private LocalDate startDate;
    private LocalDate endingDate;
    private float traveledKm;

    public SpecialServiceDTO(float plannedFuel, float plannedKm, String serviceName, char serviceType, int contractNumber, LocalDate startDate, LocalDate endingDate, float traveledKm) {
        super(plannedFuel, plannedKm, serviceName, serviceType);
        this.contractNumber = contractNumber;
        this.startDate = startDate;
        this.endingDate = endingDate;
        this.traveledKm = traveledKm;
    }
}
