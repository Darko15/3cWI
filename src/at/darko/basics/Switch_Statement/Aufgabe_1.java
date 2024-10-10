package at.darko.basics.Switch_Statement;

import java.util.Random;

public class Aufgabe_1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNum = random.nextInt(5);
        int randomNumber = 5 + randomNum;

        System.out.println(randomNumber);

        // Wenn der Wert 10 ist gib aus Ten

        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.
        if (randomNumber == 10){
            System.out.println("Ten");
        }
        if (randomNumber == 9){
            System.out.println("Nine");
        }
        if (randomNumber == 8){
            System.out.println("Eight");
        }
        if (randomNumber == 7){
            System.out.println("Seven");
        }
        if (randomNumber == 6){
            System.out.println("Six");
        }
        if (randomNumber == 5){
            System.out.println("Five");
        }
    }
}
