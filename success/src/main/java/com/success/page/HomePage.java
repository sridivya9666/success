package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.success.base.BaseClass;

public class HomePage extends BaseClass{
	//span[normalize-space()='Order history and details']
	

	By wishList= By.xpath("//span[normalize-space()='Order history and details']");
	By orderHistory= By.xpath("//span[normalize-space()='Order history and details']");
	By contactBtn = By.xpath("//a[@title='Contact Us']");
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateWishList() {
		 return driver.findElement(wishList).isDisplayed();
	}
	public boolean validateOrderHistory() {
		
		
	return	driver.findElement(orderHistory).isDisplayed();
	}
}
