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
    String validUsername = "kyl_1";
    String invalidUsername = "kyle!!!!!!!!!!";
    String validPassword = "Ch&&sec@ke99!";
    String invalidPassword = "password";

    // Test successful login
    boolean loginSuccess = register.loginUser(validUsername, validPassword, validUsername, validPassword);
    System.out.println("Login successful: " + loginSuccess);
    assertEquals(true, loginSuccess, "Login should be successful when correct credentials are provided");

    // Test unsuccessful login (wrong password)
    boolean loginFailurePassword = register.loginUser(validUsername, invalidPassword, validUsername, validPassword);
    System.out.println("Login failure password: " + loginFailurePassword);
    assertEquals(false, loginFailurePassword, "Login should fail with incorrect password");

    // Test unsuccessful login (wrong username)
    boolean loginFailureUsername = register.loginUser(invalidUsername, validPassword, validUsername, validPassword);
    System.out.println("Login failure username: " + loginFailureUsername);
    assertEquals(false, loginFailureUsername, "Login should fail with incorrect username");

    // Test unsuccessful login (both username and password wrong)
    boolean loginFailureBoth = register.loginUser(invalidUsername, invalidPassword, validUsername, validPassword);
    System.out.println("Login failure both: " + loginFailureBoth);
    assertEquals(false, loginFailureBoth, "Login should fail with incorrect username and password");
}
}