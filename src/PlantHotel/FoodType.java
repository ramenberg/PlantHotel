package PlantHotel;

public enum FoodType {
    CACTUS ("mineral water"),
    PALM ("tap water"),
    MEAT_EATING ("protein drink");

    public final String food;

    FoodType(String f) {
        food = f;
    }
}
