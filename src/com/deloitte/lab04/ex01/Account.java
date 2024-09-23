package com.deloitte.lab04.ex01;

class Account {
    private static long accCounter = 1000; 
    private long accNum;
    protected double balance; 
    private Person accHolder;

    public Account(Person accHolder, double initialBalance) {
        this.accNum = ++accCounter;
        this.balance = initialBalance;
        this.accHolder = accHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("insufficient bank balance !");
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public Person getAccHolder() {
        return accHolder;
    }
}
