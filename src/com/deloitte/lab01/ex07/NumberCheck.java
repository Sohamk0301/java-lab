package com.deloitte.lab01.ex07;

public class NumberCheck {

    
    public boolean checkNumber(int number) {
        String numStr = Integer.toString(number);

    
        for (int i = 1; i < numStr.length(); i++) {
           
            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        NumberCheck checker = new NumberCheck();
        
       
        int number = 134268;
        boolean result = checker.checkNumber(number);
        System.out.println("Resukt is " + result);
    }
}
