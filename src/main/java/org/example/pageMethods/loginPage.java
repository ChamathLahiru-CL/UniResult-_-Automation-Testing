package org.example.pageMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage
{
    WebDriver driver;
    WebDriverWait wait;

    public loginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(200));
    }

//    Locators
    private By userName = By.id("username");
    private By userPassword = By.id("password");
    private By userRole = By.id("role");
    private By rememberMe = By.id("rememberMe");
    private By loginBtn  = By.xpath("//button[@type='submit' and normalize-space()='Login Now']");
    private By googleLoginButton = By.xpath("//button[.//span[normalize-space()='Continue with Google']]");
    private By signUpLink = By.cssSelector("a[href='/signup']");
    private By forgotButton = By.cssSelector("a[href='/forgot-password']");

//    Reusable actions
    public void loginAccount(String username, String password, String roleValue){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(userPassword).sendKeys(password);
        Select select = new Select(driver.findElement(userRole));
        select.selectByValue(roleValue);

//         Select role properly
//        WebElement roleDropdown = driver.findElement(userRole);
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
        driver.findElement(loginBtn).click();
    }

    public void loginAccountWithRM(String username, String password, String roleValue){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(userPassword).sendKeys(password);
        Select select = new Select(driver.findElement(userRole));
        select.selectByValue(roleValue);
        driver.findElement(rememberMe).click();
        driver.findElement(loginBtn).click();
    }

    public void forgotPassword(String username, String password, String roleValue) throws InterruptedException{
        driver.findElement(userName).sendKeys(username);
        driver.findElement(userPassword).sendKeys(password);
        Select select = new Select(driver.findElement(userRole));
        select.selectByValue(roleValue);
        Thread.sleep(2000);
        driver.findElement(forgotButton).click();
    }

//    google signUp
    public void googleLogin(){
        driver.findElement(googleLoginButton).click();
    }

//    SignUp Page link
    public void signUpPage(){
        driver.findElement(signUpLink).click();
    }






//    public void validLogin(String username, String password) throws InterruptedException{
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
//    }
//
//    public void validLoginWithRM(String username, String password) throws InterruptedException{
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.id("rememberMe")).click();
//        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
//    }
//
//    public void forgotPassword(String username, String password) throws InterruptedException{
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.cssSelector("a[href='/forgot-password']")).click();
//    }
//
//    public void invalidUsername(String username, String password) throws InterruptedException{
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
//    }
//
//    public void invalidPassword(String username, String password) throws InterruptedException{
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
//    }
//
//    public void withoutUsername(String password) throws InterruptedException{
//        driver.findElement(By.id("password")).sendKeys(password);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
//    }
//
//    public void withoutPassword(String username, String password) throws InterruptedException{
//        driver.findElement(By.id("username")).sendKeys(username);
//        // Select role properly
//        WebElement roleDropdown = driver.findElement(By.id("role"));
//        Select selectRole = new Select(roleDropdown);
//        selectRole.selectByValue("student");
//        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
//    }
//
//    public void continueWithGoogle(){
//        driver.findElement(By.xpath("//button[.//span[normalize-space()='Continue with Google']]")).click();
//    }
//
//    public void signUpPage(){
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//    }

}
