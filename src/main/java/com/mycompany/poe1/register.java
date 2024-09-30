/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */




public class register {
    private String username;
    private String password;
    public register() {
        
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Check if the username is valid
    public boolean checkUsername(String username) {
        // Check if username contains "_" and is no more than 5 characters
        return username.contains("_") && username.length() <= 5;
    }
    

    public boolean checkPassword(String password) {
        System.out.println("Create your password:");
       
        boolean hasDigit = false;
        boolean hasCapital = false;
        boolean hasSpecial = false;
        boolean isLong = password.length() >= 8;

        String specialCharacters = "+=-_)(*&^%$#@!";

        // Check each character in the password for the required conditions
        for (int i = 0; i < password.length(); i++) {
            char result = password.charAt(i);
            if (Character.isDigit(result)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(result)) {
                hasCapital = true;
            }
            if (specialCharacters.indexOf(result) >= 0) {
                hasSpecial = true;
            }
        }

        return hasDigit && hasCapital && hasSpecial && isLong;
           
           
        } 


   

  // Method to log in the user
// Method to log in the user
// Method to log in the user
public static boolean loginUser(String enteredUsername, String enteredPassword, String storedUsername, String storedPassword) {
    // Check if the provided credentials match the stored username and password
    boolean loginSuccessful = enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword);
    
    return loginSuccessful;  // Return whether login was successful
}
    // Public static method to return login success or failure message
    public static String returnLoginStatus(boolean isSuccess, String firstName, String lastName) {
        if (isSuccess) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again!";
        } else {
            return "Username or password validation failed.";
        }
    }

}