/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import javax.swing.JOptionPane;

public class Tasks {
    public Tasks() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        String choice;
        
        // Display menu and get the user choice
        choice = JOptionPane.showInputDialog(null, "Select an option:\n1) Add Tasks\n2) Show Report\n3) Quit");

        // Convert the user's choice to an integer
        int option = Integer.parseInt(choice);

        // Handle each case based on the user's input
        switch (option) {
            case 1:
               addTasks();
                break;
            case 2:
                showReport();
                break;
            case 3:
                quit();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please select a valid number.");
        }
    }

    // Method for adding tasks
    public void addTasks() {
        String [] className = new String[a];
      
      for(int i = 0; i < a  ; i++){
        
      
       className[i] = JOptionPane.showInputDialog(null, "Enter a name"+(i + 1)+ ":");
       
       
       
    }
    }

    // Method for showing a report
    public void showReport() {
        // Your logic for showing the report goes here
        JOptionPane.showMessageDialog(null, "coming soon");
        // This could retrieve and display tasks or other information
    }

    // Method for quitting the application
    public void quit() {
        JOptionPane.showMessageDialog(null, "Exiting the program. Goodbye!");
        System.exit(0);  // Terminates the application
    }

    
       
    }

