package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.success.base.BaseClass;
import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.OrderPage;
import com.success.page.addToCardPage;
import com.success.page.loginInPage;
import com.success.page.searchReturnPage;

public class OrderPageTest extends BaseClass {
	
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
		 
	}

	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	
public void verifyOrderPage() throws InterruptedException {
	

	ip.searchProduct("t-shirt");
	sp=ip.searchBtn();
ap=	sp.clickOnProduct();
	ap.validateQuantity("2");
	ap.validateSize("M");
	ap.validateClickOnCard();
 boolean msg = ap.validartemsgTOrF();
 op=ap.validateCheckDownBtn();
double unit = op.validateUnitPrice();
 double total = op.validateTotalPrice();
double totalexp = (unit*2)+2;
Assert.assertEquals(total,totalexp);
}
}
