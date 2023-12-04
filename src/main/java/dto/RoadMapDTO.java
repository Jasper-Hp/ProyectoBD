package dto;

import java.time.LocalDate;

public class RoadMapDTO {
    private int idRoadMap;
    private String roadMapNumber;
    private LocalDate date;
    private float traveledKm;

    public RoadMapDTO(String roadMaprNumber, LocalDate date, float traveledKm) {
        this.roadMapNumber = roadMaprNumber;
        this.date = date;
        this.traveledKm = traveledKm;
    }

    public int getIdRoadMap() {
        return idRoadMap;
    }

    public String getRoadMaprNumber() {
        return roadMapNumber;
    }

    public void setRoadMaprNumber(String roadMaprNumber) {
        this.roadMapNumber = roadMaprNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getTraveledKm() {
        return traveledKm;
    }

    public void setTraveledKm(float traveledKm) {
        this.traveledKm = traveledKm;
    }
}
