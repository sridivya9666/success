package com.success.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addToCardPage  extends BaseClass{
OrderPage op;
	
	By prooceedToCheckOutBtn= By.xpath("	//span[normalize-space()='Proceed to checkout']");
	By quantity = By.xpath("	//input[@id='quantity_wanted']");
	By size= By.xpath("//select[@id='group_1']");
	By addToCardBtn = By.xpath("//span[normalize-space()='Add to cart']");
	By msgTOrF = By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']");
	//span[normalize-space()='Proceed to checkout']
	public addToCardPage() {

		PageFactory.initElements(driver, this);
		
	}

	public void validateQuantity(String qty) {
		
		driver.findElement(quantity).sendKeys(qty);
	}
	
	
public void validateSize(String sizes) throws InterruptedException {
	
	
	Select s=new Select((WebElement) driver.findElements(size));
	Thread.sleep(1000);
s.selectByVisibleText(sizes);

}

public void validateClickOnCard() {
	
	driver.findElement(addToCardBtn).click();
}


public boolean validartemsgTOrF() {
	return driver.findElement(msgTOrF).isDisplayed();
	
}

public OrderPage validateCheckDownBtn() throws InterruptedException {
	 WebElement checkin = driver.findElement(prooceedToCheckOutBtn);
	
	 checkin.click();
	 Thread.sleep(1000);
	return new OrderPage();
}





	}
	
	
	


