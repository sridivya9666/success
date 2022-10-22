package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class addressPage extends createNewAccountPage {

	By checkOut = By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");

	public addressPage() {

		PageFactory.initElements(driver, this);
	}

	public shipingPage validateCheckOut() {
		driver.findElement(checkOut).click();
		return new shipingPage();
	}

}
