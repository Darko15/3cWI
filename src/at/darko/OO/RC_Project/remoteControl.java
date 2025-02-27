package at.darko.OO.RC_Project;

public class remoteControl {
    private Battery battery1;
    private Battery battery2;


    public remoteControl(int ladeStatus1, int ladeStatus2) {
        Battery battery1 = new Battery(ladeStatus1);
        Battery battery2 = new Battery(ladeStatus2);
    }

    public int getLadeStatus1() {
        int ladeStatus1 = battery1.getLadeStatus();
        return ladeStatus1;
    }

    public int getLadeStatus2() {
        int ladeStatus2 = battery2.getLadeStatus();
        return ladeStatus2;
    }

    public void turnOn() {
        battery1.turnOn();
        battery2.turnOn();
    }

    public void turnOff() {
        battery1.turnOff();
        battery2.turnOff();
    }
}
