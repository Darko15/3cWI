package Strukturierte_Programmierung.Loops;

public class Aufgabe_2 {
    public static void main(String[] args) {
        // Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.

        int Zahl = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                Zahl = Zahl + i;
            }
        }
        System.out.println(Zahl);
    }
}

