package PlantHotel_EJ_INLAMNING;

public abstract class Plant {
    private String name;// encapsulation. private var.
    private double length; // meter
    protected String plantType;

    public Plant(String name, double length, String plantType) {
        this.name = name;
        this.length = length;
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // inkapsling
        this.name = name;
    } // encapsulation

    public double getLength() {
        return length;
    }

    public void setLength(double length) { // inkapsling
        this.length = length;
    }
}
