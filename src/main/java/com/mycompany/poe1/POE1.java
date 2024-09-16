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
        int count = 0;
         String username;
String password;
String firstName;
String lastName;
String user;
String pass;
Scanner sc = new Scanner(System.in);
System.out.println("Create your username");
        username = sc.next();
        
        System.out.println("Create your password");
        password = sc.next();
        
        System.out.println("Enter your first name");
       firstName= sc.next();
       
       System.out.println("Enter your last name");
        lastName= sc.next();
        
        if(username.contains("_") && username.length()<=5){
            System.out.println("Username Succesfuly captured");    
        }
        else{
            System.out.print("User name is not correctly formatted please ensure that your user name contains an underscore and is no more than 5 characters in length");
        }

                  sc.close();
}
}
