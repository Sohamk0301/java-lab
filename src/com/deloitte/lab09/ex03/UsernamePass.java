package com.deloitte.lab09.ex03;

interface Authenticator {
    boolean authenticate(String username, String password);
}

public class UsernamePass {
    public static void main(String[] args) {
       
        String originalUsername = "soham";
        String originalPass = "soham@123";

        Authenticator authenticator = (username, password) -> 
            username.equals(originalUsername) && password.equals(originalPass);

        // Example usage
        String inputUsername = "soham";
        String inputPass = "soham@123";

        boolean isAuthenticated = authenticator.authenticate(inputUsername, inputPass);

        if (isAuthenticated) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}