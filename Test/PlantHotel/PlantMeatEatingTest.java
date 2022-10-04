package PlantHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantMeatEatingTest {

    PlantMeatEating ME = new PlantMeatEating("ME_namn", 0.7);
    @Test
    void getFeedingAmountTest() {
        assert(ME.getFeedingAmount() == 0.24);
        ME.setFoodAmountBase(0.5);
        assert(ME.getFeedingAmount() != 0.24);
    }
}