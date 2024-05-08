import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initbalance) {
        this.balance = initbalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }
}
class Atmemthod{
    private BankAccount userAccount;

    public Atmemthod(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (amount > 0 && userAccount.withdraw(amount)) {
            System.out.println("Withdrew $" + amount + ". Remaining balance: $" + userAccount.checkBalance());
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            userAccount.deposit(amount);
            System.out.println("Deposited $" + amount + ". New balance: $" + userAccount.checkBalance());
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is $" + userAccount.checkBalance());
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayOptions();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    withdraw(withdrawAmount);
                    break;
                case "2":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    deposit(depositAmount);
                    break;
                case "3":
                    checkBalance();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
public class Atm {
    public static void main(String[] args) {
         BankAccount userAccount = new BankAccount(1000);
        Atmemthod atm = new Atmemthod(userAccount);
        atm.start();
    }
}
