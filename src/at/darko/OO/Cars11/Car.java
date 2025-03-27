package at.darko.OO.Cars11;

public class Car {

    private Engine engine;
    private Manufacturer manufacturer;
    private int color;
    private int maxSpeed;
    private String basePrice;
    private String baseConsumption;


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(int color) {
        this.color = color;
    }

}
