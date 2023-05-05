package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationPage extends Baseclass {

	public AnimationPage(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
	MobileElement Animation_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hide-Show Animations']")
	MobileElement HideShowAnimation_btn;

	@AndroidFindBy(id = "com.hmh.api:id/hideGoneCB")
	MobileElement hideBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='0']")
	MobileElement clickzero_btn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
	MobileElement clickone_btn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='2']")
	MobileElement clicktwo_btn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='3']")
	MobileElement clickthree_btn;

	@AndroidFindBy(id = "com.hmh.api:id/addNewButton")
	MobileElement showanimation_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='View Flip']")
	MobileElement ViewFlip_btn;

	@AndroidFindBy(id = "com.hmh.api:id/button")
	MobileElement Flip_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Loading']")
	MobileElement LoadingBtn;

	@AndroidFindBy(id = "com.hmh.api:id/startButton")

	MobileElement runBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation/Hide-Show Animations']")
	MobileElement Hide_show_Animation_title;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Un']")
	MobileElement UnElement;

	public void animationclicks() {
		Animation_btn.click();
		HideShowAnimation_btn.click();
	}

	public void click_HideBox() {
		hideBtn.click();
	}

	public void check_hidebtn_works() {
		clickzero_btn.click();
		clickone_btn.click();
		clicktwo_btn.click();
		clickthree_btn.click();
	}

	public void showanimation() {
		showanimation_btn.click();
	}

	public void click_ViewFlip() {
		Animation_btn.click();
		ViewFlip_btn.click();
	}

	public void click_flip() {
		Flip_btn.click();
	}

	public void click_LoadingBtn() {
		Animation_btn.click();
		LoadingBtn.click();
	}

	public void click_runBtn() {
		runBtn.click();
	}

	public boolean titleHideShow() {
		Hide_show_Animation_title.getText();
		return true;
	}

	public boolean check_UnElement() {
		UnElement.getText();
		return true;
	}
}