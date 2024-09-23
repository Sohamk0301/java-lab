package com.deloitte.lab04.ex01;

class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(Person accHolder, double initialBalance) {
        super(accHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Cannot withdraw, minimum balance must be maintained!");
        }
    }
}
