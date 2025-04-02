package at.darko.OO.Cars11;

public class Car {
    private int mileage;
    private Engine engine;
    private Manufacturer manufacturer;
    private String color;
    private int maxSpeed;
    private int basePrice;
    private double baseConsumption; // Liter per 100km

    public Car(int mileage, String color, int maxSpeed, int basePrice, double baseConsumption, Manufacturer manufacturer, Engine engine) {
        this.mileage = mileage;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    public double calculatePrice() {
        return basePrice - (basePrice * manufacturer.getDiscount());
    }


}
