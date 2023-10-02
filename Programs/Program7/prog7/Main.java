package Program7.prog7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private double balance;

    public Account(int accountNumber, String accountHolder, double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class AccountManager {
    private static final AccountManager INSTANCE = new AccountManager();
    private final Map<Integer, Account> accounts = new HashMap<>();

    private AccountManager() {}

    public static AccountManager getInstance() {
        return INSTANCE;
    }

    public synchronized void createAccount(int accountNumber, String accountHolder, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new Account(accountNumber, accountHolder, initialBalance));
            System.out.println("Account created for " + accountHolder + " with account number " + accountNumber);
        } else {
            System.out.println("Account with account number " + accountNumber + " already exists.");
        }
    }

    public synchronized void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Account with account number " + accountNumber + " not found.");
        }
    }

    public synchronized void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrawn " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient balance in account " + accountNumber);
            }
        } else {
            System.out.println("Account with account number " + accountNumber + " not found.");
        }
    }

    public synchronized double getBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account with account number " + accountNumber + " not found.");
            return 0.0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = AccountManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter Account Holder: ");
                    String accountHolder = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();
                    accountManager.createAccount(accountNumber, accountHolder, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    accountManager.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    accountManager.withdraw(accountNumber, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    double balance = accountManager.getBalance(accountNumber);
                    System.out.println("Account Balance: " + balance);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}