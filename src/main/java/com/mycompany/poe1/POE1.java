/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    register myRegisterObj = new register();
    String username;
    String password;

    // Prompt for username
    System.out.println("Please create a username:");
    username = sc.next();

    // Check if the username is valid
    boolean isUsernameValid = myRegisterObj.checkUsername(username);

    if (isUsernameValid) {
        System.out.println("Username succesfully captured");
        // If the username is valid, prompt for password
        System.out.println("Please create a password:");
        password = sc.next();

        // Check the password complexity
        boolean isPasswordValid = myRegisterObj.checkPassword(password);
        if (isPasswordValid) {
            System.out.println("Password successfully captured.");

            // Capture first and last name
            System.out.println("Enter First Name: ");
            String firstName = sc.next();

            System.out.println("Enter Last Name: ");
            String lastName = sc.next();
        
   
            // Attempt to log in with the registered credentials
          boolean isLoginSuccessful = register.loginUser(username, password, firstName, lastName);
          if (isLoginSuccessful) {
                System.out.println("Login was successful.");
            } else {
                System.out.println("Please check your username and password.");
            }
        } else {
            // Password is not valid
            System.out.println("Password is not correctly formatted. Please ensure that your password contains at least 8 characters, a capital letter, a number, and a special character.");
        }
    } else {
        // Username is not valid
        System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }

    sc.close();  // Close the scanner
}
}