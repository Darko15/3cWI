package at.darko.OO.RC_Project;

public class Battery {
    private int ladeStatus;

    public Battery(int ladeStatus) {
        this.ladeStatus = ladeStatus;
    }

    public int getLadeStatus() {
        int mittelwert = (
        return mittelwert;
    }

    public void turnOn() {
        ladeStatus = Math.max(0, ladeStatus - 5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }


}


