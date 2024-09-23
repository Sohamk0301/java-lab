package com.deloitte.lab09.ex01;

@FunctionalInterface
interface Power {
    double calculate(int x, int y);
}

public class Ex1 {
    public static void main(String[] args) {
        Power power = (x, y) -> Math.pow(x, y);

        int x = 2;
        int y = 3;
        double result = power.calculate(x, y);
        
        // Print the result
        System.out.println("result is: " + result);
    }
}
