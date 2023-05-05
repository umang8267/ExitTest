package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import Excel.xlsReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Baseclass {
	public static Properties prop;
	public static AppiumDriver<MobileElement> wd;
	public static AppiumDriverLocalService service;

	public Baseclass() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(".resources/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void setup() {

		service = AppiumDriverLocalService.buildDefaultService();
		service.start();

		DesiredCapabilities capabilities = new DesiredCapabilities();
		xlsReader reader = new xlsReader("./src/main/java/Excel/configure.xlsx");
		capabilities.setCapability("isHeadless", true);
		capabilities.setCapability("platformName", reader.getCellData("ConfigData", 1, 1));
		capabilities.setCapability("platformVersion", reader.getCellData("ConfigData", 1, 2));
		capabilities.setCapability("appPackage", reader.getCellData("ConfigData", 1, 3));
		capabilities.setCapability("appActivity", reader.getCellData("ConfigData", 1, 4));
//		capabilities.setCapability("app", prop.getProperty("app"));
			capabilities.setCapability("app","C:\\Users\\umangaggarwal\\eclipse-workspace\\AppiumExitTest\\resources\\APIDemos.apk");
		capabilities.setCapability("deviceName", reader.getCellData("ConfigData", 1, 5));
		try {
			wd = new AppiumDriver<MobileElement>(new URL(reader.getCellData("ConfigData", 1, 7)), capabilities);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stopAppium() {
		wd.quit();
		service.stop();
	}
}
