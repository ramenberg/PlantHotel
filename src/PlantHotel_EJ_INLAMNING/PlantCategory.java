package PlantHotel_EJ_INLAMNING;

public enum PlantCategory {
    CACTUS ("cactus"),
    PALM ("palm"),
    MEAT_EATING ("meat eating");

    public final String categoryType;

    PlantCategory(String f) {
        categoryType = f;
    }
}
