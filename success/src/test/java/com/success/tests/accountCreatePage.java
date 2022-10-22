package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.success.base.BaseClass;
import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.createNewAccountPage;
import com.success.page.loginInPage;

public class accountCreatePage extends BaseClass {
	
	
	IndexPage ip;
	loginInPage lp;
	HomePage hp;
	createNewAccountPage cnap;
	@BeforeMethod
	public void launch() throws InterruptedException {

		initlasation();
		ip = new IndexPage();
		lp = new loginInPage();
	cnap=new createNewAccountPage();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	
	}
	
	@Test(groups="smoke")
	public void verifyCreateAccount() {
		
	lp=	ip.validateSignIn();
 cnap=	lp.NewAccount("divyasri@gmail.com");
	
 boolean result = cnap.validateAccountTitle();
		
	Assert.assertTrue(result);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
