package at.darko.OO.Has_A;

public class Car {
    private Engine engine;
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;

    public void honk() {
        System.out.println("Ich bin ein " + this.brand + "und habe die Farbe " + this.color + "und habe " + this.engine);
    }

/*
    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelAmount = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }
*/

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
