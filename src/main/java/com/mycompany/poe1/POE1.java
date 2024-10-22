/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class POE1 {
    
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        register registerObj = new register();
        
        // Declarations
        String username;
        String password;
        String firstName;
        String lastName;

        // Prompt user for their details
        

        System.out.print("Create a username: ");
        username = sc.next();
        
        // Check if the username is valid
        if (registerObj.checkUsername(username)) {
            System.out.println("Username successfully captured.");
            
            System.out.print("Create a password: ");
            password = sc.next();

            // Check the password
            if (registerObj.checkPassword(password)) {
                System.out.println("Password successfully captured.");
                
                System.out.print("Enter your Firstname: ");
        firstName = sc.next();

        System.out.print("Enter your Lastname: ");
        lastName = sc.next();
                
                // Set the username and password
                registerObj.setUsername(username);
                registerObj.setPassword(password);
                
                System.out.println("Enter your username to login:");
                username= sc.next();
                System.out.println("Enter password to login");
                password = sc.next();

                // Attempt to log in with the registered credentials
               boolean isLoginSuccessful = register.loginUser(username, password, registerObj.getUsername(), registerObj.getPassword());
                System.out.println(register.returnLoginStatus(isLoginSuccessful, firstName, lastName));
            if (isLoginSuccessful){
            Tasks kj = new Tasks();
            
            } else {
                System.out.println("Password is not correctly formatted. Please ensure that your password contains at least 8 characters, a capital letter, a number, and a special character.");
            }
        } else {
            System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }

        sc.close();  // Close the scanner
    }
}
}   
    