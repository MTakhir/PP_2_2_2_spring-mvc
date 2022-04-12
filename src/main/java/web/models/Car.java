package web.models;

public class Car {
    private int id;
    private String model;
    private String colour;

    public Car(int id, String model, String colour) {
        this.id = id;
        this.model = model;
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }
}
