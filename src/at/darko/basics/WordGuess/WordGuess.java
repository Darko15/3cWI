package at.darko.basics.WordGuess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class WordGuess {
    public static void main(String[] args) {

        String word = "Good Morning";
        int attempts = 0;
        int wordLength = word.length();

        char[] wordArray = word.toCharArray();
        char[] hiddenArray = new char[wordLength];


        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        char guess;

        System.out.println("Current Guess: " + String.valueOf(hiddenArray));
        System.out.println("Enter a letter to guess: ");
        guess = scanner.nextLine().charAt(0);


        for (int i = 0; i < wordLength; i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(guess)) {
                hiddenArray[i] = word.charAt(i);
                boolean found = true;

                if (!found) {
                    attempts++;
                    System.out.println("Your guess was wrong! Current amount of attempts: " + attempts);
                } else {
                    attempts++;
                    System.out.println("You guessed correctly! Current amount of attempts: " + attempts);
                }

                if (Arrays.equals(hiddenArray, word.toCharArray())) {
                    System.out.println("Good job! The word was: " + word);
                    break;
                }


            }
        }

    }
}

