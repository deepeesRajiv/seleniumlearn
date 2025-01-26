package com.example.selenium_training_1.selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com_example_selenium_training_pages.selenium_training_loginpages;

public class com_example_selenium_calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ixigo.com/");
				//driver.manage().window().maximize();
				Thread.sleep(10000);
		//driver.findElement(By.xpath("//div[@class='flex justify-between mx-auto max-w-[1240px] relative mainContainer']")).click();
		//driver.findElement(By.xpath("//div[@class='flex justify-between mx-auto max-w-[1240px] relative mainContainer']")).click();
				driver.findElement(By.xpath("//button[@id='closeButton']//span[text()='×']")).click();
				
				driver.switchTo().alert().dismiss();
				
				//Exception in thread "main" org.openqa.selenium.NoAlertPresentException: no such alert
				 // (Session info: chrome=131.0.6778.265)
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				Thread.sleep(5000);
				
				//selenium_training_loginpages page = new selenium_training_loginpages(driver);
	}

}
