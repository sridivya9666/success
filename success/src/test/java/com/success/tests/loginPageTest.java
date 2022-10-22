package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.loginInPage;

public class loginPageTest extends com.success.page.BaseClass {
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
		 getDriver().quit();
		
	}
//	( dataProvider="credentials", dataProviderClass=Dataproviders.class)
	@Test(groups={"smoke","sanity"})//( dataProvider="credentials", dataProviderClass=Dataproviders.class)
	public void verifylogin() throws InterruptedException {

		lp = ip.validateSignIn();
		hp = lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		//hp = lp.validateLogin(username,password);

		Assert.assertEquals( getDriver().getTitle(), "Login - My Store");

	}

}
