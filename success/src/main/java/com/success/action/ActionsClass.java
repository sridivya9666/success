package com.success.action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.success.page.BaseClass;

public class ActionsClass extends BaseClass {
	
	public static String captureScreen(WebDriver diver, String fileName) throws IOException {
		String timestamp = new SimpleDateFormat("yy.mm.dd.hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		String target = (System.getProperty("user.dir" ) + "\\screenshot\\" + fileName + "_" + timestamp + ".png");
		try {
			FileUtils.copyFile(source, new File(target));
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return target;

	}

	public String randomnum() {

		String generatestring2 = RandomStringUtils.randomAlphanumeric(5);
		return generatestring2;

	}

	public String randomstring() {

		
		String generatestring = RandomStringUtils.randomAlphabetic(5);
		return generatestring;

	}

}
