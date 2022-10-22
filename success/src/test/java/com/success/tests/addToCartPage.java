package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.success.base.BaseClass;
import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.OrderPage;
import com.success.page.addToCardPage;
import com.success.page.loginInPage;
import com.success.page.searchReturnPage;

public class addToCartPage  extends BaseClass{
	IndexPage ip;
	loginInPage lp;
	HomePage hp;
	addToCardPage ap;
	searchReturnPage sp;
	 OrderPage op;
	@BeforeMethod
	public void launch() throws InterruptedException {

		initlasation();
		ip = new IndexPage();
		lp = new loginInPage();
	 ap= new addToCardPage ();
	  sp=new searchReturnPage ();
	op=new  OrderPage ();
	op.validateUnitPrice();
	op.validateTotalPrice();
	
	 
	}

	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	@Test(groups={"smoke","sanity","Regression"})
	public void verifyaddToCart() throws InterruptedException {
		
		ip.searchProduct("t-shirt");
		sp=ip.searchBtn();
	ap=	sp.clickOnProduct();
		ap.validateQuantity("2");
		ap.validateSize("M");
		ap.validateClickOnCard();
	ap.validartemsgTOrF();
	
	Assert.assertTrue(true);
	}
	}


