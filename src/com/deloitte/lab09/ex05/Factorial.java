package com.deloitte.lab09.ex05;

import java.util.function.Function;

public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        
        Function<Integer, Long> factorialFunction = Factorial::factorial;

        int number = 5;
        long result = factorialFunction.apply(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
	
}
