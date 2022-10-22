
package com.success.page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.success.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	// public static WebDriver driver;
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driver.get();

	}

	@BeforeSuite(groups = { "smoke", "sanity", "Regression" })
	public void loadconfig() {

		ExtentManager.setextent();;

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\DIVYA\\eclipse-workspace\\success\\configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initlasation(String browserName) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		// String browserName = prop.getProperty("browser");
		// log.info("started");
		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			// driver = new ChromeDriver();
			driver.set(new ChromeDriver());
			// log.info("chrome lanched");

		} else if (browserName.equals("ff")) {

			WebDriverManager.firefoxdriver().setup();
			// driver = new FirefoxDriver();
			driver.set(new FirefoxDriver());
			// log.info("ff lanched");
		} else if (browserName.equals("IE")) {

			WebDriverManager.iedriver().setup();
			// driver = new InternetExplorerDriver();
			driver.set(new InternetExplorerDriver());
			// log.info("ie");
		}

		getDriver().manage().window().maximize();
		Thread.sleep(2000);

		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		getDriver().get(prop.getProperty("url"));
		// log.info("url lanched");
	}

	@AfterMethod(groups = { "smoke", "sanity", "Regression" })
	public void close() {
		getDriver().close();

	}

	@AfterSuite
	public void aftersuit() {
		ExtentManager.endextent();
	}


}
