import java.util.Scanner;

public class BankingApplication {
    private double balance;

    public BankingApplication(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingApplication myAccount = new BankingApplication(0);

        System.out.println("Welcome to the Simple Banking Application");
        char option;
        do {
            System.out.println("A. Deposit");
            System.out.println("B. Withdraw");
            System.out.println("C. Check Balance");
            System.out.println("D. Exit");
            System.out.print("Choose an operation: ");
            option = scanner.next().toUpperCase().charAt(0);

            switch (option) {
                case 'A':
                    System.out.print("Enter an amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 'B':
                    System.out.print("Enter an amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 'C':
                    myAccount.checkBalance();
                    break;
                case 'D':
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option! Please enter A, B, C, or D.");
            }
        } while (option != 'D');

        scanner.close();
    }
}
