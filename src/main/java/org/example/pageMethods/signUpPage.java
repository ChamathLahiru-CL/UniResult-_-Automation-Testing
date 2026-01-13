package org.example.pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class signUpPage {

    WebDriver driver;
    WebDriverWait wait;

    public signUpPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

//    Locators(Catch the Elements)

    private By signUpLink = By.cssSelector("a[href='/signup']");
    private By name = By.id("fullName");
    private By email = By.id("email");
    private By enrollment = By.id("enrollmentNumber");
    private By password = By.id("password");
    private By confirmPassword = By.id("confirmPassword");
    private By agreeTerms = By.id("agreeTerms");
    private By signUpButton = By.id("//button[@type='submit']//span[normalize-space()='Sign Up Now']");


//    Actions

    public void openSignUpPage(){
        wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
//        driver.findElement(signUpLink).click();
    }

    public void signUpInputValidDetails(String fullName, String userEmail, String enrollmentNo, String userPassword){

        wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys(fullName);
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(enrollment).sendKeys(enrollmentNo);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(confirmPassword).sendKeys(userPassword);
        driver.findElement(agreeTerms).click();

    }

    public void clickSignUpButton(){
        driver.findElement(signUpButton).click();
    }

//        public void signUpInputValidDetails(String fullName, String email, String enrollmentNo, String password){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys(fullName);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        driver.findElement(By.id("email")).sendKeys(email);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        driver.findElement(By.id("agreeTerms")).click();
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//
//    }

//    public void validateName(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
//    public void validateEmail(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
//    public void validateSameEmail(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
//    public void validateEnrollment(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
//    public void validateSameEnrollment(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
//    public void validatePassword(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
//    public void validateConfirmPassword(String fullName, String email, String enrollmentNo, String password) throws InterruptedException{
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href='/signup']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("fullName")).sendKeys(fullName);
//        Thread.sleep(300);
//        driver.findElement(By.id("email")).sendKeys(email);
//        Thread.sleep(300);
//        driver.findElement(By.id("enrollmentNumber")).sendKeys(enrollmentNo);
//        Thread.sleep(300);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("confirmPassword")).sendKeys(password);
//        Thread.sleep(300);
//        driver.findElement(By.id("agreeTerms")).click();
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//button[@type='submit']//span[normalize-space()='Sign Up Now']")).click();
//        Thread.sleep(2000);
//    }
//
}
