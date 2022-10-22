package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.success.page.IndexPage;

public class IndexPageTest extends com.success.page.BaseClass {

	IndexPage ip;
	@Parameters("browserName")
	@BeforeMethod(groups={"smoke","sanity","Regression"})
	
		public void launch(String browserName) throws InterruptedException {
		initlasation(browserName);
		ip = new IndexPage();

	}

	@Test(priority = 1,groups="smoke")
	public void verifyLogo() {

		ip.validateLogo();
		Assert.assertTrue(false);
	}

	@Test(priority = 2,groups="smoke")
	public void verifyTitle() {
	
		String actuall = ip.validateTitle();

		Assert.assertEquals(actuall, "My Store");
	}

	@AfterMethod(groups={"smoke","sanity","Regression"})
	public void close() {
		 getDriver().quit();;
	}

}
