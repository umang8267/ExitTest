package Pages;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewPage extends Baseclass {

	public ViewPage(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
	MobileElement view_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Radio Group']")
	MobileElement radio_btn;

	@AndroidFindBy(id = "com.hmh.api:id/clear")
	MobileElement clear_btn;

	@AndroidFindBy(id = "com.hmh.api:id/choice")
	MobileElement checkchoice;

	/* Method of  swipe the screen using  vertical swipe Functionality */
	public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = wd.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * endPercentage);
		new TouchAction(wd).press(point(anchor, startPoint)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(anchor, endPoint)).release().perform();
	}

	public void click_view() {
		view_btn.click();
	}

	public void click_radio_clear() {
		radio_btn.click();
		clear_btn.click();
	}

//	WebElement IrctcLogo = driver.findElement(By.Id(“irctclogo”));
//	Assert.assertEquals(true, IrctcLogo.isDisplayed());
//	System.out.println(“IRCTC logo is displayed – Assert passed”);
//	
	public boolean check_choice() {
		checkchoice.getText();
		return true;

	}
}
