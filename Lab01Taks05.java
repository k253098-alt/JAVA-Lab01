package Lab01Task01;

import java.util.Scanner;

public class Lab01Taks05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";
        double balance = 5000.0;

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("\nLogin Successful!\n");
            char choice;
            do {
                System.out.println("** Welcome to Bank of Pakistan **");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Account Status");
                System.out.print("Select your choice: ");
                int option = sc.nextInt();
                switch (option) {

                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        System.out.println("Amount Deposited Successfully!");
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Amount Withdrawn Successfully!");
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;
                    case 3:
                        System.out.println("Account Holder: " + username);
                        System.out.println("Current Balance: Rs. " + balance);
                        break;
                    default:

                        System.out.println("Invalid Choice!");
                }
                System.out.println("\nAccount Holder: " + username);
                System.out.println("Remaining Balance: Rs. " + balance);
                System.out.print("\nDo you want to continue? [y/Y]: ");
                choice = sc.next().charAt(0);
                System.out.println();
            } while (choice == 'y' || choice == 'Y');
            System.out.println("Thank you for using Bank of Pakistan!");
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }
}