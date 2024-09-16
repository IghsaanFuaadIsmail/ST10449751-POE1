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
        checkUsername();  
 checkPassword();

String firstName;
String lastName;
String user;
String pass;
Scanner sc = new Scanner(System.in);





        
        
        
        System.out.println("Enter your first name");
       firstName= sc.next();
       
       System.out.println("Enter your last name");
        lastName= sc.next();
    }
        public static void checkUsername(){
         String username;   
         Scanner sc = new Scanner(System.in);
        System.out.println("Create your username");
        username = sc.next();
        if(username.contains("_") && username.length()<=5){
            System.out.println("Username Succesfuly captured");    
        }
        else{
            System.out.print("User name is not correctly formatted please ensure that your user name contains an underscore and is no more than 5 characters in length");
        }
        
    }
      public static void checkPassword(){
          String password;
          Scanner sc = new Scanner(System.in);
          System.out.println("Create your password");
        password = sc.next();
          boolean hasDigit =false;
          boolean hasCapital =false;
          boolean hasSpecial =false;
          boolean isLong = password.length()>=8;
          
          String specialCharacters = "+=-_)(*&^%$#@!";
          
          for(int i = 0;i < password.length(); i++){
          char result = password.charAt(i);
          
          if(Character.isDigit(result)){
              hasDigit = true;
      }
          if(Character.isUpperCase(result)){
              hasCapital = true;
          
      }
          if(specialCharacters.indexOf(result) >= 0){
              hasSpecial = true;
          }
          if(hasDigit && hasCapital && hasSpecial && isLong){
              System.out.println("password captured succesfully");
          }
          else{
              System.out.println("Password is not formatted correctly please ensure that the password contains atleast 8 letters, a capital letter, a special character and a number ");
              
          }
          }
          
      
          
    


                  

}
}
