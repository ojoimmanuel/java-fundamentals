package assignments;

import java.util.Random;
import java.util.Scanner;

public class SimpleGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt(100);

//        System.out.println("random number is " + randomNum);

        for (int numOfAttempts = 15; numOfAttempts > 0; numOfAttempts--) {
            System.out.println("Guess a number from 0 to 100 (you have " + numOfAttempts + " attempts left): ");

            int guessNum = scanner.nextInt();

            String highOrLow = (guessNum > randomNum) ? "high" : "low";

            int difference = Math.abs(randomNum - guessNum);
            if (difference == 0) {
                System.out.println("Bravo! You guessed right!");
            } else if (difference >= 10) {
                System.out.println("Guessed number is too " + highOrLow + "! Try again.");
            } else {
                System.out.println("Guessed number is " + highOrLow + " but close. Try again.");
            }
        }
        scanner.close();
    }
}
