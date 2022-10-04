package PlantHotel;

import javax.swing.*;

public class Main{
    public Main() {
        PlantCactus Igge = new PlantCactus("Igge", 0.2);
        PlantPalm Laura = new PlantPalm("Laura", 5.0);
        PlantPalm Putte = new PlantPalm("Putte", 1.0);
        PlantMeatEating Meatloaf = new PlantMeatEating("Meatloaf", 0.7);

        String planta = JOptionPane.showInputDialog("Which plant should be fed? ");

        try {
            if (planta.equalsIgnoreCase("igge")) {
                JOptionPane.showMessageDialog(null, Igge.getFeedingMethod());
            } else if (planta.equalsIgnoreCase("laura")) {
                JOptionPane.showMessageDialog(null, Laura.getFeedingMethod());
            } else if (planta.equalsIgnoreCase("putte")) {
                JOptionPane.showMessageDialog(null, Putte.getFeedingMethod());
            } else if (planta.equalsIgnoreCase("meatloaf")) {
                JOptionPane.showMessageDialog(null, Meatloaf.getFeedingMethod());
            } else
                JOptionPane.showMessageDialog(null, "No plant with that name exists. ");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"No plant specified. Program exit. ");
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        Main hotell = new Main();
    }
}
