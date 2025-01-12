# Guess The Number Game

## Description

This Java program implements a simple "Guess the Number" game. The user can choose to play in one of two modes:

1.  **Number Picker:** The user chooses a number between 1 and 100, and the computer tries to guess it using a binary search algorithm.
2.  **Number Guesser:** The computer chooses a random number between 1 and 100, and the user tries to guess it.

The game continues until the user chooses not to play again.

### Game Modes

1.  **Number Picker:**
    *   Choose mode `1` when prompted.
    *   Enter your secret number between 1 and 100.
    *   The computer will make guesses, and you should provide feedback:
        *   Type `>` if your number is larger than the computer's guess.
        *   Type `<` if your number is smaller than the computer's guess.
        *   Type `=` if the computer has guessed your number correctly.

2.  **Number Guesser:**
    *   Choose mode `2` when prompted.
    *   Enter your guesses, and the program will let you know if the secret number is higher or lower.
    *   Continue to guess until you find the secret number.

### Playing Again

After each game, you will be asked if you want to play again.
*   Type `yes` to play another game.
*   Type `no` to exit the program.

## How to Run

1.  **Compile the Java Code:** Make sure you have the Java Development Kit (JDK) installed. Navigate to the directory containing `GuessTheNumber.java` and run the following command in your terminal:
    ```bash
    javac GuessTheNumber.java
    ```
2.  **Run the Program:** Then, run the program using:
    ```bash
    java GuessTheNumber
    ```

## Code Explanation

*   The program uses the `Scanner` class to receive user input.
*   The `Random` class is used for the computer to generate a random number when playing as a number guesser.
*   The binary search algorithm is implemented for the computer to efficiently guess the user’s number in "Number Picker" mode.

## Author

empmaynmtusrgdyt

## License

This project is licensed under the GPL
