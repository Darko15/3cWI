package at.darko.OO.Constructor_Encapsulation;

public class Car {
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;

/*
    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelAmount = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }
*/

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

f
