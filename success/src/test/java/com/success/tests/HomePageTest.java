package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.success.base.BaseClass;
import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.loginInPage;

public class HomePageTest extends BaseClass {
	IndexPage ip;
	loginInPage lp;
	HomePage hp;

	@BeforeMethod
	public void launch() throws InterruptedException {

		initlasation();
		ip = new IndexPage();
		lp = new loginInPage();
	}

	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	
	@Test(groups="smoke")
	public void verifyHomePage() throws InterruptedException {
		
		
		ip.validateSignIn();
	hp=	lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	 boolean wish = hp.validateWishList();
boolean orderHistory = hp.validateOrderHistory();
	
	Assert.assertTrue(wish);
	
	
	Assert.assertTrue(orderHistory);
	
		
	}
	
	
	

}
