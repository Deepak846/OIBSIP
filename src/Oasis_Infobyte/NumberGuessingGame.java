package Oasis_Infobyte;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100.");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            count++;

            if (guess < number) {
                System.out.println("Too low. Try again.");

            } else if (guess > number) {
                System.out.println("Too high. Try again.");
            }
            else{
                System.out.println("Correct! You win!");
                System.out.println("You took " + count + " guesses.");
            }

            }
        }
    }