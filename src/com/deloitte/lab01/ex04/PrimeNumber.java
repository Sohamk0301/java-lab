package com.deloitte.lab01.ex04;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a +ve number: ");
        int number = scanner.nextInt();

        System.out.println("Prime numbers are:");
        for (int i = 2; i <= number; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

