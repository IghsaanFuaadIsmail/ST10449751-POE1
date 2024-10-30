/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe1;




import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class registerTest {

    // Test constructor
    public registerTest() {
    }

  
  // Test for username validation
@Test
public void testCheckUsernames() {
    String validUsername = "kyl_1";
    String invalidUsername = "kyle!!!!!!!!!!";

    // Create an instance of the 'register' class
    register instance = new register();

    // Test with valid username
    boolean validResult = instance.checkUsername(validUsername);{
    System.out.println("Username Welcome<first name, last name> it is great to see you");
    assertEquals(true, validResult, "Username correctly formatted should be true");

    // Test with invalid username
    boolean invalidResult = instance.checkUsername(invalidUsername);
    System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length");
    assertEquals(false, invalidResult, "Username incorrectly formatted should be false");
}
}
// Test for password complexity validation
@Test
public void testCheckPasswordComplexity() {
    String validPassword = "Ch&&sec@ke99!";
    String invalidPassword = "password";

    // Create an instance of the 'register' class
    register instance = new register();

    // Test with valid password
    boolean validResult = instance.checkPassword(validPassword);
    System.out.println("Password succesfully captured");
    assertEquals(true, validResult, "Password correctly formatted should be true");

    // Test with invalid password
    boolean invalidResult = instance.checkPassword(invalidPassword);
    System.out.println("Password not corrected formatted correctly please ensure that password has 8 characters, a capital letter, a number and a special character");
    assertEquals(false, invalidResult, "Password incorrectly formatted should be false");
}
    // Test for login success and failure
  @Test
public void testLoginUser() {
    register register = new register();
    String validUsername = "kyl_1";
    String invalidUsername = "kyle!!!!!!!!!!";
    String validPassword = "Ch&&sec@ke99!";
    String invalidPassword = "password";
    
 // Test successful login
        register.registerUser(validUsername, validPassword); // Register the user first
        boolean loginSuccess = register.loginUser(validUsername, validPassword);
        System.out.println("Login successful: " + loginSuccess);
        assertTrue(loginSuccess, "The system returns: True");

        // Test unsuccessful login with incorrect password
        boolean loginFailed = register.loginUser(validUsername, invalidPassword);
        System.out.println("Login failed: " + loginFailed);
        assertFalse(loginFailed, "The system returns: False");

        // Test username correctly formatted
        boolean usernameCorrectFormat = register.checkUsername(validUsername);
        System.out.println("Username correctly formatted: " + usernameCorrectFormat);
        assertTrue(usernameCorrectFormat, "The system returns: True");

        // Test username incorrectly formatted
        boolean usernameIncorrectFormat = register.checkUsername(invalidUsername);
        System.out.println("Username incorrectly formatted: " + usernameIncorrectFormat);
        assertFalse(usernameIncorrectFormat, "The system returns: False");

        // Test password meets complexity requirements
        boolean passwordMeetsComplexity = register.checkPassword(validPassword);
        System.out.println("Password meets complexity requirements: " + passwordMeetsComplexity);
        assertTrue(passwordMeetsComplexity, "The system returns: True");

        // Test password does not meet complexity requirements
        boolean passwordDoesNotMeetComplexity = register.checkPassword(invalidPassword);
        System.out.println("Password does not meet complexity requirements: " + passwordDoesNotMeetComplexity);
        assertFalse(passwordDoesNotMeetComplexity, "The system returns: False");
    }

    // Helper methods for assertions
    public static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    public static void assertFalse(boolean condition, String message) {
        if (condition) {
            throw new AssertionError(message);
        }
    }
}