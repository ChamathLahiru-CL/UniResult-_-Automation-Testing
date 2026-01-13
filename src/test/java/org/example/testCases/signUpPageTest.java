package org.example.testCases;

import org.testng.annotations.Test;

public class signUpPageTest extends BaseTest {

//    declare the variables
//    we can change the data and check all validation combine user input data
    String name = "Test003";
    String email = "ict22003";
    String enrollment = "UWU/ICT/22/003";
    String password = "test003";
    String confirmPassword = "";

    @Test
    public void testSignupValidData(){
        signUpPage.openSignUpPage();
        signUpPage.signUp(name,email,enrollment,password,confirmPassword);
        signUpPage.clickSignUpButton();
    }

//    @Test
//    public void testPassword(){
//        signUpPage.openSignUpPage();
//        signUpPage.validateConfirmPassword(name,email,enrollment,password);
//        signUpPage.clickSignUpButton();
//    }
//
//    @Test
//    public void testInvalidConfirmPW(){
//        signUpPage.openSignUpPage();
//        signUpPage.invalidConfirmPW(name,email,enrollment,password,confirmPassword);
//        signUpPage.clickSignUpButton();
//    }




}
