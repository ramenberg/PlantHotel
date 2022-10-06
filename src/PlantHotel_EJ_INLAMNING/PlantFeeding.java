package PlantHotel_EJ_INLAMNING;

public interface PlantFeeding {

    enum PlantCategory {
        CACTUS ("cactus"),
        PALM ("palm"),
        MEAT_EATING ("meat eating");

        public final String categoryType;

        PlantCategory(String f) {
            categoryType = f;
        }
    }
    double getFeedingAmount();
    String getFoodType(String food);
    default String getFeedingMethod() {
        return "Specified feeding method not available. ";
    }

    PlantCategory[] category = PlantCategory.values();

//    for(PlantCategory cat : category) {
//        switch (cat) {
//            case CACTUS ->
//                getFoodType(FoodType.CACTUS.food);
//                getFeedingAmount(PlantCactus.getFoodAmountBase());
//            break;
//            case PALM ->
//                getFoodType(FoodType.PALM.food);
//            break;
//            case MEAT_EATING ->
//                getFoodType(FoodType.MEAT_EATING.food);
//            break;
//        }
//    }
}
