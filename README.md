# Number Guessing Game

This is a simple Java console-based number guessing game where the player tries to guess a randomly generated number within a specified range.

## Features

- Generate a random number within a specified range.
- Prompt the user to enter their guess for the generated number.
- Provide feedback on whether the guess is correct, too high, or too low.
- Limit the number of attempts the user has to guess the number.
- Option for multiple rounds, allowing the user to play again.

## Game Rules

1. The game generates a random number between a specified range (e.g., 1 to 100).
2. The player has a limited number of attempts to guess the correct number.
3. Feedback is provided for each guess to indicate if it is correct, too high, or too low.
4. The game ends when the player guesses the correct number or exceeds the maximum attempts.

## How to Play

1. Run the Java program `NumberGuessingGame.java`.
2. Follow the on-screen instructions to guess the random number.
3. Enter your guess and receive feedback until you guess correctly or run out of attempts.
4. Enjoy playing and try to guess the number within the limited attempts!

## Game Configuration

- **Range:** The game's default range is set to 1 to 100. You can modify the `minRange` and `maxRange` variables in the code to change the range.
- **Attempts:** The default maximum attempts allowed is set to 5. You can adjust the `maxAttempts` variable in the code to change this limit.

## Requirements

- Java Development Kit (JDK) installed
- Command-line interface (Terminal or Command Prompt)

## How to Run

1. Compile the Java file:
```
javac NumberGuessingGame.java
```
2. Run the compiled program:
```
java NumberGuessingGame
```
3. Follow the on-screen instructions to play the game.
