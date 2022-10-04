package PlantHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantCactusTest {

    PlantCactus ett = new PlantCactus("Ett", 0.2);

    @Test
    public void getFeedingAmountTest() {
        assert(ett.getFeedingAmount() == 0.2);
        ett.setFoodAmountBase(0.5);
        assert (ett.getFoodAmountBase() != 0.2);
    }
}