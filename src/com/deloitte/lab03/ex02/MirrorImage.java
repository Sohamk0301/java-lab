package com.deloitte.lab03.ex02;

public class MirrorImage {
    public static String getImage(String input) {
    	String original = input ;
        StringBuffer str = new StringBuffer(input);
        String mirror = str.reverse().toString();
        return original + "|" + mirror;
    }

    public static void main(String[] args) {
        String input = "Soham";
        String result = getImage(input);
        System.out.println("Output: " + result);
    }
}

