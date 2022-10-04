package PlantHotel;

public class PlantCactus extends Plant implements PlantFeeding{

    public PlantCactus(String name, double length) {
        super(name, length);// polymorfism
    }

    @Override
    public String getFoodType() {
        return FoodType.CACTUS.food; // enum
    }
    @Override
    public double getFeedingAmount() { // Cactus 0.2 cl liquid/plant
        return 0.2;
    }
    @Override
    public String getFeedingMethod() {
        return String.format("Feed %s %s cl of %s daily.",
                getName(), getFeedingAmount(), getFoodType());
    }
}
