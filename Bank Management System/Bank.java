import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.accountNumber, account);
        System.out.println("Account created successfully.");
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
