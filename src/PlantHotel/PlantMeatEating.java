package PlantHotel;

public class PlantMeatEating extends Plant implements PlantFeeding{
    protected double foodAmountBase = 0.1;
    protected double foodAmountPerMeter = 0.2; // extra 0.2 l per meter
    public PlantMeatEating(String name, double length) {
        super(name, length); // polymorfism
    }

    public double getFoodAmountBase() {
        return foodAmountBase;
    }
    public double getFoodAmountPerMeter() {
        return foodAmountPerMeter;
    }
    // setters för framtida ändringar
    public void setFoodAmountBase(double foodAmountBase) {
        this.foodAmountBase = foodAmountBase;
    }
    public void setFoodAmountPerMeter(double foodAmountPerMeter) {
        this.foodAmountPerMeter = foodAmountPerMeter;
    }

    // METHOD-overrides

    @Override
    public String getFoodType() {
        return FoodType.MEAT_EATING.food; // enum
    }
    @Override
    public double getFeedingAmount() {
        return getFoodAmountBase() + (getFoodAmountPerMeter() * getLength()); // 0.1 l base + 0.2 l/m extra
    }
    @Override
    public String getFeedingMethod() {      // use of interface
        return String.format("Feed %s %s L of %s daily.",
                getName(), getFeedingAmount(), getFoodType());
    }
}
