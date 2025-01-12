import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args){
        System.out.println("Hello. This is the “Guess the Number” game. " +
                "Enter 1 to play as the number picker; enter 2 to play as the number guesser " +
                "(the computer will pick).");
        Scanner input = new Scanner(System.in);
        int choose_a_mode;
        while (true){
            choose_a_mode = input.nextInt();
            if (choose_a_mode == 1 || choose_a_mode == 2){
                break;
            }
            System.out.println("Incorrect input. Please enter either 1 or 2.");
        }
        if (choose_a_mode == 1){
            System.out.println("You’ve decided to pick the number. Okay, enter your number from 1 to 100:");
            int user_number = input.nextInt();
            int one = 1;
            int hun = 100;
            int computer_number;
            while (true){
                computer_number = one + (hun - one) / 2;
                System.out.println("Your number is " + computer_number + " ?");
                System.out.println("If your number is larger than " + computer_number + ", then print >; " +
                        "if your number is smaller than " + computer_number + ", print <; " +
                        "if I have guessed your number correctly, print =.");
                String MLE = input.next();
                if (MLE.equals("=")){
                    System.out.println("I guessed your number! It was " + computer_number);
                    break;
                } else if (MLE.equals(">")) {
                    one = computer_number + 1;
                } else if (MLE.equals("<")) {
                    hun = computer_number - 1;
                }
                else {
                    System.out.println("Incorrect input. Please enter either <, > or =");
                }
            }
        }
        if (choose_a_mode == 2){
            System.out.println("You’ve decided to guess the number. Enter your guess:");
            Random r = new Random();
            int computer_number = r.nextInt(101);
            int user_guess = input.nextInt();
            while (true){
                if (user_guess < computer_number){
                    System.out.println("The secret number is larger than your input. " +
                            "Please enter another guess:");
                    user_guess = input.nextInt();
                } else if (user_guess > computer_number) {
                    System.out.println("The secret number is smaller than your input. " +
                            "Please enter another guess:");
                    user_guess = input.nextInt();
                } else {
                    System.out.println("Congratulations! You guessed correctly! The number was - "
                            + computer_number);
                    break;
                }
            }
        }
    }
}
