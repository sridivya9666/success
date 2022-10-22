package com.success.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.success.base.BaseClass;
import com.success.page.HomePage;
import com.success.page.IndexPage;
import com.success.page.OrderConfirmationPage;
import com.success.page.OrderPage;
import com.success.page.OrderSummerPage;
import com.success.page.addToCardPage;
import com.success.page.addressPage;
import com.success.page.loginInPage;
import com.success.page.paymentPage;
import com.success.page.searchReturnPage;
import com.success.page.shipingPage;

public class endtoendTest extends BaseClass {	
	IndexPage ip;
	loginInPage lp;
	HomePage hp;
	OrderSummerPage osp;
	OrderConfirmationPage ocp;
	addToCardPage ap;
	paymentPage pp;
	searchReturnPage sp;
	 OrderPage op;
	 addressPage adp;
	 shipingPage shp;
	 
	@BeforeMethod
	public void launch() throws InterruptedException {

		initlasation();
		ip = new IndexPage();
	ocp=new	OrderConfirmationPage ();
		lp = new loginInPage();
	 ap= new addToCardPage ();
	  sp=new searchReturnPage ();
	op=new  OrderPage ();
	adp=new addressPage ();
osp=	new OrderSummerPage();
shp=	new shipingPage();
 pp=new paymentPage();
	}

	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	@Test(groups="Regression")
	public void verifyEndTOEnd() throws InterruptedException {
		

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
	
	lp=op.validatecheckout();
	adp=lp.validateLogin1(prop.getProperty("username"), prop.getProperty("password"));
	
	shp=adp.validateCheckOut();
	shp.validateClickOnCheckBox();
pp=	shp.validateChectOut();
osp=pp.validatebankWire();

ocp=osp.validatebankWire();
String confirmationMssg = ocp.validateOrderConfirmationPage();
Assert.assertEquals(confirmationMssg, "Your order on My Store is complete.");
	}
	
	

}
