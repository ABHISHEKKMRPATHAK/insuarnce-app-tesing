package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePageFunctions;
import utilities.reports;

public class tc11_clicksOnAutomobile extends reports {
	WebDriver driver;
	HomePageFunctions user1;
	@Given("^user ,already is in homepage$")
	public void user_already_is_in_homepage() throws Throwable {
		driver = new ChromeDriver();
		startTest();
		user1= new HomePageFunctions(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
	}

	@When("^User clicks on automobiles$")
	public void user_clicks_on_automobiles() throws Throwable {
		  System.out.println("User clicked on Automobile..");
		  user1.automobile();
		  captureScreenshot(driver);
	}

	@Then("^System should navigates to automobile window for entering data$")
	public void system_should_navigates_to_automobile_window_for_entering_data() throws Throwable {
		  System.out.println("System displayed for filling form for  automobile .");
         writetoTest();
		  user1.close();
		  endTest();
	}
}
