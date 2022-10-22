package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.success.base.BaseClass;

public class searchReturnPage extends BaseClass {
	
	
	By addToCard= By.xpath("	//span[normalize-space()='Add to cart']");
	By productResult= By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	//span[normalize-space()='Add to cart']
	
	public searchReturnPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validateProductAvalible() {
		
	return	driver.findElement(productResult).isDisplayed();
		
	}
	
	public addToCardPage clickOnProduct() {
		
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(productResult));
		
		driver.findElement(addToCard).click();
		return  new addToCardPage();
		
		
		
		
		
	}
	

}
