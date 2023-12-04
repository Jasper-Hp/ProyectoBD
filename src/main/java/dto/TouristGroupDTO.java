package dto;

public class TouristGroupDTO {
    private int idTouristGroup;
    private String groupCountry;
    private int passengersCount;

    public TouristGroupDTO(String groupCountry, int idTouristGroup, int passengersCount) {
        this.groupCountry = groupCountry;
        this.idTouristGroup = idTouristGroup;
        this.passengersCount = passengersCount;
    }
}
