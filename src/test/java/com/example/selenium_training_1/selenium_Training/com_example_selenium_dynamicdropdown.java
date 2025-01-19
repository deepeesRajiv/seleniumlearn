package com.example.selenium_training_1.selenium_Training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_example_selenium_dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv Deshpande\\Documents\\selenium_Training\\selenium_Training\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.icicibank.com/personal-banking/accounts/savings-account");
		driver.get("https://www.ixigo.com/hotels/search/result?locationId=86&locationName=Bengaluru&locationType=C&masterLocationId=3644&countryId=1&checkinDate=20012025&checkoutDate=21012025&adultCount=2&roomCount=1&childCount=0&ab=&source=flight%20search%20bundle&subsource=&cc=");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='flex flex-grow items-center']//input[@placeholder = 'Enter area, locality or hotel']")).click();
		driver.findElement(By.xpath("//div[@class='flex flex-grow items-center']//input[@placeholder = 'Enter area, locality or hotel']")).sendKeys("Basa");
		//driver.findElement(By.xpath("//div[@class='flex flex-grow items-center']//input[@placeholder = 'Enter area, locality or hotel']")).click();

		Thread.sleep(2000);
		
List<WebElement> place=	 driver.findElements(By.xpath("//div[@class='min-w-0 overflow-hidden']//p"));

WebElement ele;
for(int i=0;i<place.size();i++) {
	ele=place.get(i);
	System.out.println(ele.getText());
}
for(WebElement needplace:place) {
	if(needplace.getText().equalsIgnoreCase("Basavanagudi")){
		needplace.click();
	}
}

		//		 driver.findElement(By.id("search-chatInput")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("search-chatInput")).sendKeys("Account");
//		 Thread.sleep(3000);
		
		
		 
		 
	}

}
