package _14;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return String.format("¥%d(口座番号:%s)", this.balance, this.accountNumber);
    }

    public boolean equals(BankAccount otherAccount) {
        if (this == otherAccount) {
            return true;
        }
        String trimedAccountNumber = this.accountNumber.trim();
        String trimedOtherAccountNumber = otherAccount.accountNumber.trim();

        if (trimedAccountNumber.equals(trimedOtherAccountNumber)) {
            return true;
        } else {
            return false;
        }
    }
}
