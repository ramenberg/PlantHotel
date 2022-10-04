package PlantHotel;

public class PlantMeatEating extends Plant implements PlantFeeding{

    public PlantMeatEating(String name, double length) {
        super(name, length); // polymorfism
    }
    @Override
    public String getFoodType() {
        return FoodType.MEAT_EATING.food; // enum
    }
    @Override
    public double getFeedingAmount() {
        return 0.1 + (0.2 * getLength()); // 0.1 l base + 0.2 l/m extra
    }
    @Override
    public String getFeedingMethod() {
        return String.format("Feed %s %s L of %s daily.",
                getName(), getFeedingAmount(), getFoodType());
    }
}
