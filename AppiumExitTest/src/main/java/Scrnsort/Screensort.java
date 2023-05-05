package Scrnsort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Screensort {
	public static void takeScreenShot(AppiumDriver<MobileElement> wd,String filename) {
		String screenshotFileName = System.getProperty("user.dir");
		File scrFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(screenshotFileName + "/screenshots/" + filename + ".png"));
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}