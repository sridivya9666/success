package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class OrderPage  extends BaseClass{
	
	
	By unitPrice= By.xpath("//span[contains(text(),'$16.51')]");
	By totalPrice= By.xpath("//span[@id='total_price']");
	By proCheckOutBtn = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
	
	
	public OrderPage() {

		PageFactory.initElements(driver, this);
		
	}

public double validateUnitPrice() throws InterruptedException {
	Thread.sleep(1000);
	String unitp = driver.findElement(unitPrice).getText();
	String unit = unitp.replaceAll("[^a-zA-Z0-9]", "");
	double fn = Double.parseDouble(unit);
	return fn/100;
	
	
	
}
public double validateTotalPrice() {
	
	String unitp = driver.findElement(totalPrice).getText();
	String unit = unitp.replaceAll("[^a-zA-Z0-9]", "");
	double fn = Double.parseDouble(unit);
	return fn/100;
	
	
	
}


public loginInPage validatecheckout() {
	
	driver.findElement(proCheckOutBtn).click();
	return  new loginInPage();
	
}
}
