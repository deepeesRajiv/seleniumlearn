package com.example.selenium_training_1.selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Parkbank_RegisterPage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String ProjectPath = System.getProperty("user.dir");
        String chromeDriverPath = ProjectPath + "\\driver\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //selenium_training_loginpages page = new selenium_training_loginpages(driver);
        //page.loginApplication("rahulshettyacademy", "learning");
        System.out.println("The browser is success opened and maximised");
    }
}
