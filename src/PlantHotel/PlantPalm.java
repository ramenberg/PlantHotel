package PlantHotel;

public class PlantPalm extends Plant implements PlantFeeding{

    protected double foodAmountBase = 0.5; // 0.5 l liquid/meter
    public PlantPalm(String name, double length) {
                super(name, length); // polymorfism
    }

    // getters & setters
    public double getFoodAmountBase() {
        return foodAmountBase;
    }
    public void setFoodAmountBase(double foodAmountBase) {
        this.foodAmountBase = foodAmountBase;
    }

    // METHOD-overrides
    @Override
    public String getFoodType() {
        return FoodType.PALM.food; // enum
    }
    @Override
    public double getFeedingAmount() {
        return getFoodAmountBase() * getLength();
    }
    @Override
    public String getFeedingMethod() {
        return String.format("Feed %s %s L of %s daily.",
                getName(), getFeedingAmount(), getFoodType());
    }
}
