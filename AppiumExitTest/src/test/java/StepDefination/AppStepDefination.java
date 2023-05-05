package StepDefination;

import static org.testng.Assert.assertFalse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.testng.Assert.assertTrue;
//import static org.testng.Assert.assertFalse;

import org.testng.Assert;

import Base.Baseclass;
import Pages.AppPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppStepDefination extends Baseclass {
	Logger log =(Logger) LogManager.getLogger("AppStepDefination.class");
	public AppPage user = new AppPage(wd);
	
	
////////////////////////Display_SHOW_TITLE////////////////////////////////////

	@When("user click on App button and then click Action bar Button")
	public void user_click_on_app_button_and_then_click_action_bar_button() {
		user.open_actionBar();
		log.info("clicking on app and then click on Action bar");

	}

	@Then("user click in Display Options")
	public void user_click_in_display_options() {
		user.open_DisplayOption();
		log.info("click on the display options");
	}

	@Then("click on the Display_SHOW_TITLE Button")
	public void click_on_the_display_show_title_button() {
		user.check_showtitle();
		log.info("clicking on the Display_SHOW_TITLE");

	}

	@Then("user validate that button is hidden")
	public void user_validate_that_button_is_hidden() {
		
		assertFalse(user.check_pageTitle());
		log.info("ckecking that now title is hidden");

	}

	@Then("user click again Display_SHOW_TITLE Button")
	public void user_click_again_display_show_title_button() {
		user.check_showtitle();
		log.info("again clicking on the Display_SHOW_TITLE");
	}

	@Then("user validate Title is visible again")
	public void user_validate_title_is_visible_again() {
		assertTrue(user.check_pageTitle());
		log.info("ckecking that now title is visible again ");


	}

	////////////// NAVIGATION BUTTON///////////////////////////////////////////////

	@When("click on AppButton and then click ActionBar Button")
	public void click_on_app_button_and_then_click_action_bar_button() {
		user.open_actionBar();
		log.info("clicking on app and then click on Action bar");

	}

	@Then("click in Display Options")
	public void click_in_display_options() {
		user.open_DisplayOption();
		log.info("clicking on display options");
	}

	@Then("click on the Navigation Button")
	public void click_on_the_navigation_button() {
		log.info("clicking on navigation button");

		user.click_naviagtion();
		Assert.assertEquals(true, user.checkTAB2());
		log.info("check that multiple navigation bar is now visible");
	}

	////////////////////////////// SET PASSWORD////////////////////////////////

	@When("user click on app button and then device Admin")
	public void user_click_on_app_button_and_then_device_admin() {
		log.info("clicking on app and then admin");

	}

	@When("open password quality Button")
	public void open_password_quality_button() {
		user.click_passwordQuality();
		log.info("clicking on password quality button");

	}

	@Then("click on set password and then select continue Without Fingerprint option")
	public void click_on_set_password_and_then_select_continue_without_fingerprint_option() {

		user.click_contiunewithoutFinger();
		log.info("clicking on set password and then click on continue Without Fingerprint");
		
	}

	@Then("user select the type of Unloacking like pin,pasword")
	public void user_select_the_type_of_unloacking_like_pin_pasword() {
		log.info("clicking on type of password");
		user.setupPass();
	}

	@Then("user enter the {int} digit password {string} and then click on next button")
	public void user_enter_the_digit_password_and_then_click_on_next_button(Integer int1, String password) {
		log.info("enter the password an click on next");
		String Pass = password;
		user.fillpassword(Pass);

	}

	@Then("user reenter password {string} then click on Ok Button and")
	public void user_reenter_password_then_click_on_ok_button_and(String repassword) {
		log.info("REnter the password an click on next");
		String repass = repassword;
		user.ReEnter_pass(repass);
	}

	@Then("click on Done Button")
	public void click_on_done_button() {
		log.info("click on done button");
		Assert.assertEquals(true, user.check_doneBtn());
		log.info("validate that the password is set");

	}

}
