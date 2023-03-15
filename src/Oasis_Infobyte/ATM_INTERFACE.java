package Oasis_Infobyte;

import java.util.*;

public class ATM_INTERFACE {

    public static void main(String[] args) {

        int balance = 5000; // starting balance
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Your Pin");
        int Pin=sc.nextInt();
            System.out.println("Welcome to My ATM!");
            System.out.println("Choose an option:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Transaction History");
                    System.out.println("Your balance is " + balance);
                    System.out.println("\t\tThanks For Visiting");
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have withdrawn " + withdrawAmount + ". Your new balance is " + balance);
                        System.out.println("\t\tThanks For Visiting");
                    }
                    else {
                        System.out.println("Insufficient funds!");
                        System.out.println("\t\tThanks For Visiting");
                    }
                    break;

                case 3:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = sc.nextInt();
                    balance += depositAmount;
                    System.out.println("You have deposited " + depositAmount + ". Your new balance is " + balance);
                    System.out.println("\t\tThanks For Visiting");
                    break;

                case 4:
                    System.out.println("Enter the account no. in which you want to transfer");
                    int account= sc.nextInt();
                    System.out.println("Enter the amount");
                    int amount=sc.nextInt();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("You have transfered " + amount + ". Your new balance is " + balance);
                        System.out.println("\t\tThanks For Visiting");
                    }
                    else {
                        System.out.println("Insufficient funds!");
                        System.out.println("\t\tThanks For Visiting");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println(); // blank line for spacing
        }
    }