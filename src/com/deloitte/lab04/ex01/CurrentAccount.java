package com.deloitte.lab04.ex01;

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Cannot withdraw, overdraft limit exceeded!");
        }
    }
}
