package com.deloitte.lab03.ex01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of integers: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println(number);
            sum += number;
        }

        System.out.println("Sum " + sum);
        scanner.close();
    }
	
}
