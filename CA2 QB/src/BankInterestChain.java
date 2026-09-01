class Account {
    protected double balance;
    protected final double MIN_BALANCE = 1000.0;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.04;       // Base rate: 4%
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;       // Savings rate: 6%
    }
}

class FixedDepositAccount extends SavingsAccount {
    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        double interest = super.calculateInterest();
        return interest + 1000;      // Fixed bonus
    }
}

public class BankInterestChain {
    public static void main(String[] args) {
        FixedDepositAccount f = new FixedDepositAccount(50000);
        System.out.println("Minimum balance: " + f.MIN_BALANCE);
        System.out.println("Interest: " + f.calculateInterest());
    }
}