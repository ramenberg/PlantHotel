package PlantHotel;

public class PlantPalm extends Plant implements PlantFeeding{

    public PlantPalm(String name, double length) {
        super(name, length); // polymorfism
    }

    @Override
    public String getFoodType() {
        return FoodType.PALM.food; // enum
    }
    @Override
    public double getFeedingAmount() {
        return 0.5 * getLength();   // Palm 0.5 l liquid/meter
    }
    @Override
    public String getFeedingMethod() {
        return String.format("Feed %s %s L of %s daily.",
                getName(), getFeedingAmount(), getFoodType());
    }
}
