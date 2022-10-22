package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class OrderSummerPage extends BaseClass {

	
	By confirm= By.xpath("//span[normalize-space()='I confirm my order']");
	public OrderSummerPage () {

		PageFactory.initElements(driver, this);
		
	}
	
	public OrderConfirmationPage validatebankWire() {
		
		driver.findElement(confirm).click();
		return new OrderConfirmationPage();
	}
	
	
	
	
	
	
	
	
	

}

