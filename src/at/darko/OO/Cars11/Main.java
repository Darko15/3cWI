package at.darko.OO.Cars11;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Manufacturer manufacturer = new Manufacturer();
        Engine e1 = new Engine(10, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(100, Engine.TYPE.GAS);

        car.setEngine(e1);
    }
}
