package StepDefination;

import Base.Baseclass;
import Scrnsort.Screensort;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends Baseclass {
	
	@Before
//	**Setup method which run Before Scenario**/
	public void startAppium() {
		setup();
	}
	
	@After
//	 run after the scenario if test fails*
	public void closeAppium(Scenario scenario) {
		if(scenario.isFailed()) {
			Screensort.takeScreenShot(wd, scenario.getName());
		}
		stopAppium();
	}
	
//	public void closeAppium() {
		
//	}
	
}