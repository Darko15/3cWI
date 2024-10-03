package Strukturierte_Programmierung.Loops;

public class Aufgabe_1 {
    public static void main(String[] args) {
        // Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        int Zahl = 0;

        for(int i = 0; i<=100; i++){
            Zahl = Zahl + i;
        }
        System.out.println(Zahl);
    }
}
