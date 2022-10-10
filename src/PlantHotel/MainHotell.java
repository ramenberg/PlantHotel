package PlantHotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainHotell {
    public MainHotell() {

        List<Plant> plantsAtHotel = new ArrayList<>();
        plantsAtHotel.add(0, new PlantCactus("Igge", 0.2));
        plantsAtHotel.add(1, new PlantPalm("Laura", 5.0));
        plantsAtHotel.add(2, new PlantPalm("Putte", 1.0));
        plantsAtHotel.add(3, new PlantMeatEating("Meatloaf", 0.7));

        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Which plant should be fed? ");
                int count = 0;
                for (Plant p : plantsAtHotel) {
                    if (input.equalsIgnoreCase(p.getName())) {
                        JOptionPane.showMessageDialog(null, p.getFeedingMethod());
                        count++;
                        break;
                    }
                }
                if (count == 0)
                    JOptionPane.showMessageDialog(null, "No plant with that name" +
                            " is currently at the hotel. ");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Thank you for using the feeding program. ");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        MainHotell hotell = new MainHotell();
    }
}
