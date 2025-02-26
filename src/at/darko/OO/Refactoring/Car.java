package at.darko.OO.Refactoring;

public class Car {
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    

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

    public void remainingRange() {
        int remainingRange = (this.fuelAmount / fuelConsumption) * 100;
        System.out.println("I can drive another " + remainingRange + " kilometers");
    }
}