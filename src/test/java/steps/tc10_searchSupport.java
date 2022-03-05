package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePageFunctions;
import utilities.reports;

public class tc10_searchSupport extends reports{
	WebDriver driver;
	HomePageFunctions user1;
	@Given("^user is in .homepage$")
	public void user_is_in_homepage() throws Throwable {
		driver = new ChromeDriver();
		startTest();
		user1= new HomePageFunctions(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
	}

	@When("^User inputs the string and click enter on search support$")
	public void user_inputs_the_string_and_click_enter_on_search_support() throws Throwable {
		  System.out.println("User is searching for supports..");
		  user1.searchSupport("Motor");
		  captureScreenshot(driver);
	}

	@Then("^system should display lists of suppports available regarding the input given by user$")
	public void system_should_display_lists_of_suppports_available_regarding_the_input_given_by_user() throws Throwable {
		  System.out.println("System showed searched results");
		  writetoTest();
		  endTest();
           user1.close();
	}

}
