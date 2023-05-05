package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppPage extends Baseclass {

	public AppPage(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App']")
	MobileElement App_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Action Bar']")
	MobileElement ActionBar_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Display Options']")
	MobileElement DisplayOption_btn;

	@AndroidFindBy(id = "com.hmh.api:id/toggle_show_title")
	MobileElement showtitle_btn;

	@AndroidFindBy(id = "com.hmh.api:id/toggle_navigation")
	MobileElement navigation_btn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TAB 2']")
	MobileElement TAB2_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Device Admin']")
	MobileElement DeviceAdmin_btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	MobileElement PaswordQuality_btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
	MobileElement Setpassword_btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout")
	MobileElement continueWithoutFinger_btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout")
	MobileElement password_btn;

	@AndroidFindBy(id = "com.android.settings:id/encrypt_dont_require_password")
	MobileElement No_btn;

	@AndroidFindBy(id = "com.android.settings:id/password_entry")
	MobileElement passwordEntry_btn;

	@AndroidFindBy(id = "com.android.settings:id/next_button")
	MobileElement Next_btn;

	@AndroidFindBy(id = "com.android.settings:id/password_entry")
	MobileElement RepasswordEntry_btn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	MobileElement Ok_btn;

	@AndroidFindBy(id = "com.android.settings:id/redaction_done_button")
	MobileElement Done_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App/Action Bar/Display Options']")
	MobileElement PageTitle;

	public boolean check_pageTitle() {
		boolean is_workng;
		try {
			PageTitle.isDisplayed();
			is_workng = true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			is_workng = false;
		}
		return is_workng;
	}
	
	
	public void click_passwordQuality() {
		App_btn.click();
		DeviceAdmin_btn.click();
		PaswordQuality_btn.click();
	}

	public void click_contiunewithoutFinger() {
		Setpassword_btn.click();
		continueWithoutFinger_btn.click();
	}

	public void setupPass() {
		password_btn.click();
		No_btn.click();
	}

	public void fillpassword(String password) {
		passwordEntry_btn.sendKeys(password);
		Next_btn.click();
	}

	public void ReEnter_pass(String repassword) {
		RepasswordEntry_btn.sendKeys(repassword);
		Ok_btn.click();
		Done_btn.click();
	}

	public boolean check_doneBtn() {
		Done_btn.getText();
		return true;
	}

	public void open_actionBar() {
		App_btn.click();
		ActionBar_btn.click();
	}

	public void open_DisplayOption() {
		DisplayOption_btn.click();
	}

	public void check_showtitle() {
		showtitle_btn.click();
	}

	public void click_naviagtion() {
		navigation_btn.click();
	}

	public boolean checkTAB2() {
		TAB2_btn.isDisplayed();
		return true;
	}
}
