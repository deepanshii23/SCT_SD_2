package SCT_SD_2;


import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // random number between 1 and 100
        int userGuess = 0;
        String s = "-";
        System.out.println(s.repeat(30));
        System.out.println(" Welcome to Guess the Number!");
        System.out.println(s.repeat(30));
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until correct guess
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println(" Congratulations! You guessed the number.");
            }
        }

        sc.close();
    }
}

