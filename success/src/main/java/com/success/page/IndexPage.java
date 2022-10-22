package com.success.page;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class IndexPage extends BaseClass {

	By signBtn = By.xpath("//a[normalize-space()='Sign in']");
	By logoIcon = By.xpath("//img[@alt='My Store']");
	By contactBtn = By.xpath("//a[@title='Contact Us']");
	By searchContextBtn = By.xpath("//button[@name='submit_search']");
	By searchProductBox = By.xpath("//input[@id='search_query_top']");

	public IndexPage() {

		PageFactory.initElements( getDriver(), this);
		
	}

	public loginInPage validateSignIn() {

		 getDriver().findElement(signBtn).click();

		return new loginInPage();
	}

	public boolean validateLogo() {
		return  getDriver().findElement(contactBtn).isDisplayed();

	}

	public String validateTitle() {
		return  getDriver().getTitle();
	}

	public void searchProduct(String productname) throws InterruptedException {
Actions act=new Actions( getDriver());
		WebElement search =  getDriver().findElement(searchProductBox);
		act.moveToElement(search).click();
		
		Thread.sleep(1000);
		search.sendKeys(productname);

	}

	public searchReturnPage searchBtn() {
		Actions act=new Actions( getDriver());
		act.moveToElement( getDriver().findElement(searchContextBtn)).click().build().perform();
		
		return new searchReturnPage();

	}
	
	
	
	
	
	
	
	
	
	

}
