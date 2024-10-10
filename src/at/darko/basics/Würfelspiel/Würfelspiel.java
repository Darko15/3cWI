package at.darko.basics.Würfelspiel;

import java.util.Random;

public class Würfelspiel {
    public static void main(String[] args) {

        Random random = new Random();
        int playerSum = 0;
        int computerSum = 0;

        for (int i = 0; i < 6; i++) {
            int randomPlayer = random.nextInt(5 + 1);
            System.out.println(randomPlayer);
            playerSum += randomPlayer;
        }

        for (int i = 0; i < 6; i++) {
            int randomComp = random.nextInt(5 + 1);
            System.out.println(randomComp);
            computerSum += randomComp;
        }

        System.out.println("player sum: " + playerSum);
        System.out.println("computer sum: " + computerSum);

        if (playerSum > computerSum) {
            System.out.println("Player wins!");
        } else if (computerSum > playerSum) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("it's a draw!");
        }
    }
}
