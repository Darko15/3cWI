package at.darko.OO.Cars;

public class Car {
    public int fuelAmount;
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    private String color;


    // Methode
    public void drive() {
        System.out.println("current fuel: " + fuelAmount);
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I drive");
        System.out.println("current fuel: " + fuelAmount);
    }

    public void doBreak() {
        System.out.println("I break");
    }

    public void superBoost() {
        if (fuelAmount > 0.1 * fuelAmount) { // wir merken nie unser updated fuelAmount, also wird das immer gelten
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go SuperBoostMode");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }

    }
}