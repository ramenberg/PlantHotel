package PlantHotel;

public abstract class Plant {
    private String name;// encapsulation. private var.
    private double length; // meter

    public Plant(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // inkapsling
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) { // inkapsling
        this.length = length;
    }
}
