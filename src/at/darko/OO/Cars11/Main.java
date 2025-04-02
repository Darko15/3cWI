package at.darko.OO.Cars11;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(220, Engine.TYPE.GAS);
        Engine e2 = new Engine(150, Engine.TYPE.DIESEL);
        Manufacturer manufacturer1 = new Manufacturer("Porsche", "Austria", 0.05);
        Car car = new Car(112000, "yellow", 250, 20000, 9.5, manufacturer1, e1);

        System.out.println("Mit Rabatt koste ich: " + car.calculatePrice());

    }
}
