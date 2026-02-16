package problem2;

public class Problem2Demo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Yersaiyn");
        BankAccount a2 = new BankAccount("Nurmukhamed", BankAccount.AccountType.SAVINGS);

        a1.deposit(99999);
        a1.deposit("2500");
        a1.withdraw(32344);

        a2.deposit(333444);

        System.out.println(a1);
        System.out.println(a2);
    }
}