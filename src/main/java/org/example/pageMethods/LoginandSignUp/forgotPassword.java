package org.example.pageMethods.LoginandSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class forgotPassword {

    WebDriver driver;
    WebDriverWait wait;

    public forgotPassword(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(200));
    }

//    Locators
    private By forgotButton = By.cssSelector("a[href='/forgot-password']");
    private By userEmail = By.id("email");
    private By sendRestLink = By.xpath("//button[@type='submit' and normalize-space()='Send Reset Link']");
    private By backtoLogin =By.cssSelector("a[href='/login']");

//    Actions
    public void forgotPassword(String email){
        driver.findElement(forgotButton).click();
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(sendRestLink).click();
    }

    public void backtoLogin(){
        driver.findElement(forgotButton).click();
        driver.findElement(backtoLogin).click();
    }

}
