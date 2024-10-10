package at.darko.basics.Bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Kontostand = 5;


        while (true) {
            System.out.println("Guten Tag! Was möchten Sie tun? Geben Sie die Nummer ein: " +
                    "1. Einzahlen " +
                    "2. Abheben " +
                    "3. Kontostand " +
                    "4. Beenden ");


            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wieviel möchten Sie einzahlen?");
                int amount = scanner.nextInt();
                System.out.println(amount + "€ wurden erfolgreich eingezahlt!");
                Kontostand += amount;


            } else if (selection == 2) {
                System.out.println("Wieviel möchten Sie abheben?");
                int amount = scanner.nextInt();
                System.out.println(amount + "€ wurden erfolgreich abgehoben!");
                Kontostand -= amount;

            } else if (selection == 3) {
                System.out.println("Ihr Kontstand beträgt: " + Kontostand + "€");

            } else if (selection == 4) {
                System.out.println("Danke und Aufwiedersehen!");
                break;
            }

        }
    }
}
