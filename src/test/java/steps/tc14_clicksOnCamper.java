package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePageFunctions;
import utilities.reports;

public class tc14_clicksOnCamper extends reports {
	WebDriver driver;
	HomePageFunctions user1;
	@Given("^user ialready is in homepage$")
	public void user_already_is_in_homepage() throws Throwable {
		driver = new ChromeDriver();
		startTest();
		user1= new HomePageFunctions(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
	}
	@When("^User clicks on camper$")
	public void user_clicks_on_camper() throws Throwable {
		  System.out.println("User clicked Camper..");
		  user1.camper();
		  captureScreenshot(driver);
	}
	@Then("^System should navigates to camper window for entering data$")
	public void system_should_navigates_to_camper_window_for_entering_data() throws Throwable {
		  System.out.println("System showed for data for the camper..");
		  endTest();
		  writetoTest();
		  user1.close();
		
	}
}
