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

        // Check if the username is valid
        boolean isUsernameValid = myRegisterObj.checkUsername(sc);
        String username = "";
        String password = "";

        if (isUsernameValid) {
            // Check the password
            boolean isPasswordValid = myRegisterObj.checkPassword(sc);
            if (isPasswordValid) {
                // Capture username and password after validation
                username = myRegisterObj.getUsername();  // Retrieve captured username
                password = myRegisterObj.getPassword();  // Retrieve captured password

                // Collect first and last names for greeting purposes
                System.out.println("Enter First Name: ");
                String firstName = sc.next();

                System.out.println("Enter Last Name: ");
                String lastName = sc.next();

                // Attempt to log in with the registered credentials
                boolean isLoginSuccessful = register.loginUser(sc, username, password, firstName, lastName);

                // Output login result
                if (isLoginSuccessful) {
                    System.out.println("Login was successful.");
                } else {
                    System.out.println("Login failed. Please check your username and password.");
                }
            } else {
                System.out.println("Password validation failed.");
            }
        } else {
            System.out.println("Username validation failed.");
        }

        sc.close();  // Close the scanner
    }
}
