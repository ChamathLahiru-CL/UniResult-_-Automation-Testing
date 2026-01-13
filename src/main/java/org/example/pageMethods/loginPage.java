package org.example.pageMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class loginPage
{
    WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void validLogin(String username, String password) throws InterruptedException{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
    }

    public void validLoginWithRM(String username, String password) throws InterruptedException{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.id("rememberMe")).click();
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
    }

    public void forgotPassword(String username, String password) throws InterruptedException{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.cssSelector("a[href='/forgot-password']")).click();
    }

    public void invalidUsername(String username, String password) throws InterruptedException{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
    }

    public void invalidPassword(String username, String password) throws InterruptedException{
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
    }

    public void withoutUsername(String password) throws InterruptedException{
        driver.findElement(By.id("password")).sendKeys(password);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
    }

    public void withoutPassword(String username, String password) throws InterruptedException{
        driver.findElement(By.id("username")).sendKeys(username);
        // Select role properly
        WebElement roleDropdown = driver.findElement(By.id("role"));
        Select selectRole = new Select(roleDropdown);
        selectRole.selectByValue("student");
        driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login Now']")).click();
    }

    public void continueWithGoogle(){
        driver.findElement(By.xpath("//button[.//span[normalize-space()='Continue with Google']]")).click();
    }

    public void signUpPage(){
        driver.findElement(By.cssSelector("a[href='/signup']")).click();
    }

}
