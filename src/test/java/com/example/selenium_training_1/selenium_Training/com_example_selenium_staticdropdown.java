package com.example.selenium_training_1.selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class com_example_selenium_staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/personal-banking/accounts/savings-account");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		WebElement drop =  driver.findElement(By.id("dropdown-class-example"));
//		
//		Select selectfromdropdown = new Select(drop);
//		selectfromdropdown.selectByIndex(2);
		
WebElement drop =  driver.findElement(By.xpath("//li//div//a[@class = 'menu-nav-tablink']//span[text() ='Deposits']"));
		
		Select selectfromdropdown = new Select(drop);
		//selectfromdropdown.selectByIndex(1);
		System.out.println(selectfromdropdown.getFirstSelectedOption().getText());
		
	}

}
