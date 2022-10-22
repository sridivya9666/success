package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.success.base.BaseClass;

public class createNewAccountPage extends BaseClass {
	
	
	//h1[normalize-space()='Create an account']
	
	
	By formTitle= By.xpath("//h1[normalize-space()='Create an account']");
	
	
	public createNewAccountPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	
public boolean validateAccountTitle() {
	
	 return driver.findElement(formTitle).isDisplayed();
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
