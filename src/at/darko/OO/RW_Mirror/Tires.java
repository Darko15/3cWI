package at.darko.OO.RW_Mirror;

public class Tires {
    private String position;
    private int luftdruck;

    public Tires(String position, int luftdruck) {
        this.position = position;
        this.luftdruck = luftdruck;
    }

    public String getPosition() {
        return position;
    }

    public int getLuftdruck() {
        return luftdruck;
    }
}
