import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        String accNum, accName;
        double amount;

        while (true) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    accName = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    bank.addAccount(new SavingsAccount(accName, accNum, 0));
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    accName = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    bank.addAccount(new CurrentAccount(accName, accNum, 0));
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    Account accDep = bank.getAccount(accNum);
                    if (accDep != null) {
                        System.out.print("Enter amount to deposit: ₹");
                        amount = scanner.nextDouble();
                        accDep.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    Account accW = bank.getAccount(accNum);
                    if (accW != null) {
                        System.out.print("Enter amount to withdraw: ₹");
                        amount = scanner.nextDouble();
                        accW.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    Account accB = bank.getAccount(accNum);
                    if (accB != null) {
                        accB.displayBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using our banking system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
