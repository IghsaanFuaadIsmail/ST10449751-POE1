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

    public boolean checkUsername(Scanner sc) {
        String username;

        System.out.println("Create your username:");
        username = sc.next();

        // Check if username contains "_" and is no more than 5 characters
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return false;
        }
    }

    // Password validation
    public static boolean checkPassword(Scanner sc) {
        String password;

        System.out.println("Create your password:");
        password = sc.next();

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

        if (hasDigit && hasCapital && hasSpecial && isLong) {
            System.out.println("Password successfully captured.");
            return true;
        } else {
            System.out.println("Password is not formatted correctly. Please ensure that the password contains at least 8 characters, a capital letter, a special character, and a number.");
            return false;
        }
    }
        public class Login{
            
            
        }
    }

