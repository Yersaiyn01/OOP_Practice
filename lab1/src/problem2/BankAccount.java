package problem2;

public class BankAccount {

   
    public enum AccountType { DEBIT, CREDIT, SAVINGS }

  
    private static int nextNumber = 1000;

   
    private final int accountNumber;
    private final String owner;

    private AccountType type;
    private double balance;

   
    {
        balance = 0.0;
    }

   
    public BankAccount(String owner) {
        this(owner, AccountType.DEBIT); 
    }

   
    public BankAccount(String owner, AccountType type) {
        this.owner = owner;
        this.type = type;
        this.accountNumber = nextNumber++;
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        this.balance += amount; 
    }

        public void deposit(String amountText) {
        try {
            double amount = Double.parseDouble(amountText);
            deposit(amount);
        } catch (NumberFormatException e) {
          
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (amount > balance) return;
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

 
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}