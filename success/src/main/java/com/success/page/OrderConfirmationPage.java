package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BaseClass {

	By confirmText = By.xpath("//strong[normalize-space()='Your order on My Store is complete.']");

	public OrderConfirmationPage() {

		PageFactory.initElements(driver, this);

	}

	public String validateOrderConfirmationPage() {

		return driver.findElement(confirmText).getText();

	}
}
