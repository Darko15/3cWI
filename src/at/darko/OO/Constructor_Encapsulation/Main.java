package at.darko.OO.Constructor_Encapsulation;

public class Main {
    public static void main(String[] args) {

        /*
        Car c3 = new Car(17, "Opel", "1234O");
        System.out.println(c3.serialNumber);
        */

        Car c1 = new Car();
        c1.setFuelAmount(40);
        c1.setFuelConsumption(17);
        c1.setBrand("Audi");
        c1.setSerialNumber("1234A");


        Car c2 = new Car();
        c1.setFuelAmount(30);
        c1.setFuelConsumption(14);
        c1.setBrand("Mercedes");
        c1.setSerialNumber("1234M");

        System.out.println(c1.getFuelAmount());
    }
}

