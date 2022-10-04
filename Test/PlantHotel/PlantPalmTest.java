package PlantHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantPalmTest {

    PlantPalm P = new PlantPalm("P", 1.0);
    @Test
    void is_getFeedingAmount_correct() {
        assert(P.getFeedingAmount() == 0.5);
        assert(P.getFeedingAmount() != 1.0);
        P.setFoodAmountBase(1.0);
        assert(P.getFeedingAmount() == 1.0);
    }
}