package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarSearchPageActions;
import utils.SeleniumDriver;

public class SearchCars {
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions= new CarSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
		System.out.println("In Home Page");
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) {
		String menu=list.get(1);
		System.out.println("Menu-->"+menu);
		carsGuideHomePageActions.moveToCarsForSaleMenu();
	}
	

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchcars)  {
	    //SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	/*@When("^select car brand as \"([^\"]*)\" from make dropdown$")
	public void select_car_brand_as_from_make_dropdown(String carBrand) throws Throwable {
		carsSearchPageActions.selectCarMake(carBrand);
	}

	@When("^select car model as \"([^\"]*)\" from selectModel dropdown$")
	public void select_car_model_as_from_selectModel_dropdown(String carModel) throws Throwable {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@When("^select location as \"([^\"]*)\" from selectocation dropdown$")
	public void select_location_as_from_selectocation_dropdown(String location) throws Throwable {
		carsSearchPageActions.selectCarLocation(location);
	}

	@When("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String price) throws Throwable {
		carsSearchPageActions.selectCarPrice(price);
	}

	@When("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.clickOnNextButton();
	}

	@Then("^I see list of searched cars$")
	public void i_see_list_of_searched_cars() throws Throwable {
		System.out.println("I see list of cars");
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
*/
}
