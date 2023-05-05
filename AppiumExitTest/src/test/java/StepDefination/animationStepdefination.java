package StepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import Base.Baseclass;
import Pages.AnimationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class animationStepdefination extends Baseclass {
	public AnimationPage user = new AnimationPage(wd);

	Logger log =(Logger) LogManager.getLogger("animationStepdefination.class");
	
	@When("the user click on animation button and then click hide animation Button")
	public void the_user_click_on_animation_button_and_then_click_hide_animation_button() {
		user.animationclicks();
		log.info("first user click on animation button and then hide Animation button ");
	}

	@Then("user click in hideBtn")
	public void user_click_in_hide_btn() {
		user.click_HideBox();
		log.info("click on hide btn");
	}

	@Then("click on the below buttons one by one")
	public void click_on_the_below_buttons_one_by_one() {
		user.check_hidebtn_works();
	}

	@Then("click on the show animation")
	public void click_on_the_show_animation() {
		user.showanimation();
		Assert.assertEquals(true, user.titleHideShow());
//		Assert.assertTrue(user.titleHideShow());
		log.info("checking for the title hide "+user.titleHideShow());
	}

//////////////////////FLIP Button/////////////////////////////
	@When("the user click on the view flip button")
	public void the_user_click_on_the_view_flip_button() {
		log.info("checking for the view flip button");
		user.click_ViewFlip();
	}

	@Then("the user come at View flip page and then click on the flip button")
	public void the_user_come_at_view_flip_page_and_then_click_on_the_flip_button() {
		log.info("click on the flip button");
		user.click_flip();
		Assert.assertTrue(user.check_UnElement());
		log.info("checking that flip button work");
		
	}

//////////////////LOADING BUTTON/////////////////
	@When("the user click on the Loading button")
	public void the_user_click_on_the_loading_button() {
		user.click_LoadingBtn();
		log.info("click in loading button under animation");

	}
	@Then("the user come on Loading page then click on run")
	public void the_user_come_on_loading_page_then_click_on_run() {
		user.click_runBtn();
	}

}
