package org.example.testCases;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class loginPageTest extends BaseTest {

    String username = "UWU/CST/22/001";
    String password = "123456";
    String srole = "student";
    String arole = "admin";
    String erole = "examDiv";

    @Test
    public void testSign(){
        loginPage.loginAccount("UWU/CST/22/001", "123456","student");
    }

    @Test
    public void testInvalidUsername(){
        loginPage.loginAccount("UWU/CST/22/002", "123456","student");
    }

    @Test
    public void testInvalidPassword(){
        loginPage.loginAccount("UWU/CST/22/001", "111111","student");
    }

    @Test
    public void testInvalidRoleAD(){
        loginPage.loginAccount("UWU/CST/22/001", "123456","admin");
    }

    @Test
    public void testInvalidRoleEX(){
        loginPage.loginAccount("UWU/CST/22/001", "123456","examDiv");
    }

    @Test
    public void forgotPassword() throws InterruptedException{
        loginPage.forgotPassword("UWU/CST/22/001", "123456","student");
    }

}
