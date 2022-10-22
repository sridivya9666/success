package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class shipingPage extends BaseClass {

	//input[@id='cgv']	
	
	By checkBox = By.xpath("//input[@id='cgv']	");
	By checkOut = By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");

	public shipingPage () {

		PageFactory.initElements(driver, this);
	}

	public shipingPage validateCheckOut() {
		driver.findElement(checkOut).click();
		return new shipingPage();
	}
	public void validateClickOnCheckBox() {
		driver.findElement(checkBox).click();
		
	}
	
	
	public paymentPage validateChectOut() {
		driver.findElement(checkOut).click();
		return new paymentPage();
	}
	
	
	
	
	
	
}
