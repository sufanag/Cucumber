package steps;

import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterActions {
	
	@After
	public static void tearDown(){
		SeleniumDriver.tearDown();
	}

}
