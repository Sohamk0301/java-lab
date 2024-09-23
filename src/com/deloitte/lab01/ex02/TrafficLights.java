package com.deloitte.lab01.ex02;

import java.util.Scanner;

public class TrafficLights {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Select a traffic light:");
	        System.out.println("1. Red");
	        System.out.println("2. Yellow");
	        System.out.println("3. Green");
	        System.out.print("Enter your choice 1/2/3");
	        
	        int choice = scanner.nextInt();
	        
	        switch (choice) {
	            case 1:
	                System.out.println("Stop");
	                break;
	            case 2:
	                System.out.println("Ready");
	                break;
	            case 3:
	                System.out.println("Go");
	                break;
	            default:
	                System.out.println("please enter 1/2/3");
	                break;
	        }
	        
	        scanner.close();
	    }
}
