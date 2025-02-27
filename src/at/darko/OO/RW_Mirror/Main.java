package at.darko.OO.RW_Mirror;

public class Main {
    public static void main(String[] args) {
        RW_Mirror mirror1 = new RW_Mirror("Links");
        RW_Mirror mirror2 = new RW_Mirror("Rechts");


        Tires reifenVorneLinks = new Tires("vorne links", 32);
        Tires reifenVorneRechts = new Tires("vorne rechts", 32);
        Tires reifenHintenLinks = new Tires("hinten links", 30);
        Tires reifenHintenRechts = new Tires("hinten rechts", 30);

        System.out.println(mirror1.getPosition());
        System.out.println(reifenHintenRechts.getPosition());
    }
}


