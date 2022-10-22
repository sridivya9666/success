package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class paymentPage  extends BaseClass{

	By bankWire= By.xpath("	//a[@title='Pay by bank wire']");
	By bankByCheck= By.xpath("//a[@title='Pay by check.']");

	By confirm= By.xpath("//span[normalize-space()='I confirm my order']");
	public paymentPage () {

		PageFactory.initElements(driver, this);
		
	}
	
	public OrderSummerPage validatebankWire() {
		
		driver.findElement(bankWire).click();
		return new OrderSummerPage();
	}

}
