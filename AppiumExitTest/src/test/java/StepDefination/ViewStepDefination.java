package StepDefination;

import Base.Baseclass;
import Pages.ViewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class ViewStepDefination extends Baseclass {
	public ViewPage user = new ViewPage(wd);
	
//	static Logger log =LogManager.getLogger(ViewStepDefination.class);
	Logger log =(Logger) LogManager.getLogger("ViewStepDefination.class");

	@When("user click on View button")
	public void user_click_on_view_button() {
		user.click_view();
		log.info("click on view");
	}

	@Then("user scroll down the window until it found Radio group")
	public void user_scroll_down_the_window_until_it_found_radio_group() {
		log.info("scrolling down to Radio group");
		user.verticalSwipeByPercentages(0.90,0.10, 0.5);
		log.info("scrolling down to the window");
	}

	@Then("user click in Radio group Button and then clear button")
	public void user_click_in_radio_group_button_and_then_clear_button() {
		log.info("click on clear button");
		user.click_radio_clear();
		Assert.assertEquals(true, user.check_choice());
		log.info("checking that clear button is working porperly when click on clear button "+user.check_choice());
	}

}
