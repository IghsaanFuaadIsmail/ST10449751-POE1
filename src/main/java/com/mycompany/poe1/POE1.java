/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.poe1;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author RC_Student_lab
 */
public class POE1 {

    public static void main(String[] args) {
        register registerObj = new register(); // Create a Register object

        // Declarations
        String username;
        String password;
        String firstName;
        String lastName;

        // Prompting the user to enter their Username using JOptionPane
        username = JOptionPane.showInputDialog("Create a username (at least 5 characters and must contain an underscore):");

        // Check if the username is valid
        while (!registerObj.checkUsername(username)) {
            JOptionPane.showMessageDialog(null, "Error: Username must be at least 5 characters long and contain an underscore (_). Please try again.");
            username = JOptionPane.showInputDialog("Create a username (at least 5 characters and must contain an underscore):");
        }
        JOptionPane.showMessageDialog(null, "Username successfully captured.");

        // Prompting the user to enter their Password using JOptionPane
        password = JOptionPane.showInputDialog("Create a password (at least 8 characters, must contain a number, a capital letter, and a special character):");

        // Check if the password is valid
        while (!registerObj.checkPassword(password)) {
            JOptionPane.showMessageDialog(null, "Error: Password must be at least 8 characters long, contain a number, a capital letter, and a special character. Please try again.");
            password = JOptionPane.showInputDialog("Create a password (at least 8 characters, must contain a number, a capital letter, and a special character):");
        }
        JOptionPane.showMessageDialog(null, "Password successfully captured.");

        // Prompting the user to enter their first and last name
        firstName = JOptionPane.showInputDialog("Enter your first name:");
        lastName = JOptionPane.showInputDialog("Enter your last name:");

        // Register the Username and Password in the register object
        String registrationResult = registerObj.registerUser(username, password);
        JOptionPane.showMessageDialog(null, registrationResult);

        // Prompt for login using JOptionPane
        username = JOptionPane.showInputDialog("Enter your Username to login:");
        password = JOptionPane.showInputDialog("Enter your Password to login:");

        // Attempt to log in with the registered credentials
        boolean isLoginSuccessful = registerObj.loginUser(username, password);
        
        // Show login status message
        String loginStatus = registerObj.returnLoginStatus(isLoginSuccessful, firstName, lastName);
        JOptionPane.showMessageDialog(null, loginStatus);

        // If login is successful, show the Tasks menu
        
        if (loginStatus.startsWith("Welcome")) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban!");

            // Main menu loop for task management
            while (true) {
                // Display menu options to the user
                String menuOption = JOptionPane.showInputDialog(null,
                        "Select an option:\n1) Add Tasks\n2) Show Report (Coming Soon)\n3) Quit");
                
                // Process user selection
                switch (menuOption) {
                    case "1":
                        // Option to add tasks; calls Task class's addTasks method
                        Tasks.addTasks();
                        break;
                    case "2":
                        // Placeholder for future report functionality
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                        break;
                    case "3":
                        // Exit application and display total hours of all tasks before closing
                        JOptionPane.showMessageDialog(null, "Exiting application. Total task hours: " + Tasks.returnTotalHours() + " hours.");
                        System.exit(0);
                    default:
                        // Handle invalid menu option
                        JOptionPane.showMessageDialog(null, "Invalid option! Please select again.");
                }
            }
        } else {
            // Inform the user of a failed login and exit
            JOptionPane.showMessageDialog(null, "Login failed! Exiting application.");
            System.exit(0);  // Exit after failed login
        }
        //dialog.dispose();  // Close dialog box at the end of the session
    }
}