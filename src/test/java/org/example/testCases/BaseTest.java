package org.example.testCases;

import org.example.pageMethods.loginPage;
import org.example.pageMethods.signUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    loginPage loginPage;
    signUpPage signUpPage;

    @BeforeTest
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/OneDrive - std.uwu.ac.lk/Documents/.Web Drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/");

        loginPage = new loginPage(driver);
        signUpPage = new signUpPage(driver);

    }





}
