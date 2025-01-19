package com_example_selenium_training_pages;

import org.hibernate.boot.model.relational.InitCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selenium_training_loginpages {

	WebDriver driver;
	
	public selenium_training_loginpages(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "terms")
	WebElement terms;
	
	@FindBy(id = "signInBtn")
	WebElement signInBtn;
	
	
	public void loginApplication(String name,String pass) {
		
		username.sendKeys(name);
		password.sendKeys(pass);
		terms.click();
		signInBtn.click();
	}
	

}
