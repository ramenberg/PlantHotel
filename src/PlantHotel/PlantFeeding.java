package PlantHotel;

public interface PlantFeeding {

    double getFeedingAmount();
    String getFoodType();

    default String getFeedingMethod() {
        return "Specified feeding method not available. ";
    }

}
