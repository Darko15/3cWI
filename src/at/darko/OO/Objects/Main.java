package at.darko.OO.Objects;

public class Main {
    public static void main(String[] args) {
        Engine motor = new Engine(75);
        Tank tank = new Tank(50);
        Car car = new Car(motor, tank);


    }
}
