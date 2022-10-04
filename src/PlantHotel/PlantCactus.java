package PlantHotel;

public class PlantCactus extends Plant implements PlantFeeding{

    protected double foodAmountBase = 0.2; // 0.2 cl liquid/plant
    public PlantCactus(String name, double length) {
        super(name, length);// polymorfism
    }

    // getters & setters

    public double getFoodAmountBase() {
        return foodAmountBase;
    }

    public void setFoodAmountBase(double foodAmountBase) {
        this.foodAmountBase = foodAmountBase;
    }

    @Override
    public String getFoodType() {
        return FoodType.CACTUS.food; // enum
    }
    @Override
    public double getFeedingAmount() { // Cactus 0.2 cl liquid/plant
        return getFoodAmountBase();
    }
    @Override
    public String getFeedingMethod() {
        return String.format("Feed %s %s cl of %s daily.",
                getName(), getFeedingAmount(), getFoodType());
    }
}
