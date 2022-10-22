package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



public class loginInPage  extends BaseClass{
	
	
	By username = By.xpath("	//input[@id='email']");
	By password= By.xpath("//input[@id='passwd']");
	By loginBtn = By.xpath("//span[normalize-space()='Sign in']");
	By emailnewAccount = By.xpath("//input[@id='email_create']");
	By createNewAccountBtn= By.xpath("//span[normalize-space()='Create an account']");
	
	

	public  loginInPage () {

		PageFactory.initElements( getDriver(), this);
		
	}
	
	
	public HomePage validateLogin(String usr,String psd) throws InterruptedException {
		 getDriver().findElement(username).sendKeys(usr);
		
		Thread.sleep(1000);
		 getDriver().findElement(password).sendKeys(psd);
		Thread.sleep(1000);
		 getDriver().findElement(loginBtn);
		
		return new HomePage();
	}
		public createNewAccountPage  NewAccount(String email) {
			 getDriver().findElement(emailnewAccount).sendKeys(email);
			 getDriver().findElement(createNewAccountBtn).click();
			
			return new createNewAccountPage();
			
		}
		
		public addressPage validateLogin1(String usr,String psd) throws InterruptedException {
			 getDriver().findElement(username).sendKeys(usr);
			
			Thread.sleep(1000);
			 getDriver().findElement(password).sendKeys(psd);
			Thread.sleep(1000);
			 getDriver().findElement(loginBtn);
			
			return new addressPage();
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


