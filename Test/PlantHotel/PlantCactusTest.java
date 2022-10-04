package PlantHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantCactusTest {

    PlantCactus c = new PlantCactus("CactusTest", 0.2);

    // 0.2 cl liquid/plant
    @Test
    public void getFeedingAmountTest() {
        assert(c.getFeedingAmount() == 0.2);
        c.setFoodAmountBase(0.5);
        assert (c.getFoodAmountBase() != 0.2);
        assert (c.getFoodAmountBase() == 0.5);
    }
}