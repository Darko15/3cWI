package at.darko.OO.Cars;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.fuelAmount = 40;
        c1.fuelConsumption = 7;
        c1.brand = "Audi";
        c1.serialNumber = "A1234";


        Car c2 = new Car();
        c2.fuelAmount = 30;
        c2.fuelConsumption = 6;
        c2.brand = "Mercedes";
        c2.serialNumber = "M1234";

        Car c3 = new Car();
        c3.fuelAmount = 60;
        c3.fuelConsumption = 9;
        c3.brand = "BMW";
        c3.serialNumber = "B1234";

        c1.drive();

        c2.doBreak();

        c1.superBoost();

        c3.honk(5);

        c1.remainingRange();
    }
}
