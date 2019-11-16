package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsUsedPageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id='makes']")
	public WebElement selectMakeDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='models']")
	public WebElement selectModelDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='locations']")
	public WebElement selectLocationDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='priceTo']")
	public WebElement selectPriceDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='search-submit']")
	public WebElement findMyNextCarBtn;

}
