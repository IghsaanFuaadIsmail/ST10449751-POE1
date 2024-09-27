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

        // Initialize the Scanner object
        Scanner sc = new Scanner(System.in);

        // Create an instance of the register class
        register myregisterObj = new register();

        // Check username
        boolean isUsernameValid = myregisterObj.checkUsername(sc);
        
        // If the username is valid, proceed to check password
        if (isUsernameValid) {
            boolean isPasswordValid = register.checkPassword(sc);

            // Proceed only if both username and password are valid
            if (isPasswordValid) {
                // Input first name and last name for login greeting
                System.out.println("Enter First Name: ");
                String firstName = sc.nextLine();

                System.out.println("Enter Last Name: ");
                String lastName = sc.nextLine();

                System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
            } else {
                System.out.println("Password validation failed.");
            }
        } else {
            System.out.println("Username validation failed.");
        }

        // Close the scanner
        sc.close();
    }
}
