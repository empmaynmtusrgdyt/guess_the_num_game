import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args){
        System.out.println("Hello. This is the “Guess the Number” game. " +
                "Enter 1 to play as the number picker; enter 2 to play as the number guesser " +
                "(the computer will pick).");
        Scanner input = new Scanner(System.in);
        int choose_a_mode = input.nextInt();
        while (choose_a_mode > 3){
            System.out.println("Incorrect input. Please enter either 1 or 2.");
            choose_a_mode = input.nextInt();
        }
        if (choose_a_mode == 1){
            System.out.println("You’ve decided to pick the number. Okay, enter your number from 1 to 100:");
            int user_number = input.nextInt();
        }
        else if (choose_a_mode == 2){
            System.out.println("You’ve decided to guess the number. Enter your guess:");
            Random r = new Random(101);
            int user_guess = input.nextInt();
        }
    }
}
