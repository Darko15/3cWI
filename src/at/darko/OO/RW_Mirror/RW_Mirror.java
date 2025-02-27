package at.darko.OO.RW_Mirror;

public class RW_Mirror {
    private String position; // Bei True soll die Position links sein, ansonsten ist der Rückspiegel rechts

    public RW_Mirror(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
