package com.deloitte.lab04.ex01;

public class BankSystem {
    public static void main(String[] args) {
   
        Person soham = new Person("Soham", 30);
        Person purva = new Person("Purva", 28);
   
        SavingsAccount sohamAccount = new SavingsAccount(soham, 2000);
        CurrentAccount purvaAccount = new CurrentAccount(purva, 3000, 1000); // Kathy has an overdraft limit of 1000
    
        sohamAccount.deposit(2000);
        System.out.println(soham.getName() + "'s updated balance: " + sohamAccount.getBalance());

        purvaAccount.withdraw(2000);
        System.out.println(purva.getName() + "'s updated balance: " + purvaAccount.getBalance());
    }
}
