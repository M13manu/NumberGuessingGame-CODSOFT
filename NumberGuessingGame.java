package com.project;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int maxAttempts = 5; // Maximum attempts allowed
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + minRange + " and " + maxRange);
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        while (!guessedCorrectly && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (Math.abs(userGuess - randomNumber) <= 10) {
                if (userGuess < randomNumber) {
                    System.out.println("Close! A bit higher. Try again.");
                } else {
                    System.out.println("Close! A bit lower. Try again.");
                }
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("You've reached the maximum number of attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
