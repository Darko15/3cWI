package at.darko.OO.Has_A;

public class Engine {
    private int horsePower;

    public enum TYPE {DIESEL, GAS}

    private TYPE type;

    public Engine(int HorsePower, TYPE diesel) {
        this.horsePower = horsePower;
    }
}
