package _14;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1155", 100000);
        BankAccount account2 = new BankAccount("5000", 50000);
        BankAccount account3 = new BankAccount("   5000  ", 50000);

        System.out.println(account1);
        System.out.println(account1.equals(account2));
        System.out.println(account2.equals(account3));
    }
}
