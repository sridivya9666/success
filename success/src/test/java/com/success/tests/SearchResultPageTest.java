package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.success.base.BaseClass;
import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.addToCardPage;
import com.success.page.loginInPage;
import com.success.page.searchReturnPage;

public class SearchResultPageTest extends BaseClass {
	IndexPage ip;
	loginInPage lp;
	HomePage hp;
	addToCardPage ap;
	searchReturnPage sp;

	@BeforeMethod
	public void launch() throws InterruptedException {

		initlasation();
		ip = new IndexPage();
		lp = new loginInPage();
		sp = new searchReturnPage();
		ap = new addToCardPage();

	}

	@AfterMethod
	public void close() {
		driver.quit();

	}

	@Test
	public void serachofProduct() throws InterruptedException {

		ip.searchProduct("t-shirt");
		Thread.sleep(1000);
		sp = ip.searchBtn();
	boolean avaliable = sp.validateProductAvalible();
	Assert.assertTrue(avaliable);
		

	}

}
