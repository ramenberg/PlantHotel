package PlantHotel;

import org.junit.jupiter.api.Test;

class PlantMeatEatingTest {

    PlantMeatEating ME = new PlantMeatEating("MeatloafTest", 0.7);

    // 0.1 + extra 0.2 l per meter
    @Test
    void getFeedingAmountTest() {
        assert(ME.getFeedingAmount() == 0.24);
        ME.setFoodAmountBase(0.5);
        assert(ME.getFeedingAmount() != 0.24);
    }
}