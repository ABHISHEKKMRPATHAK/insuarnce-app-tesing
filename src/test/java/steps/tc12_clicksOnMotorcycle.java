package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePageFunctions;
import utilities.reports;

public class tc12_clicksOnMotorcycle extends reports {
	WebDriver driver;
	HomePageFunctions user1;
	@Given("^user ualready is in homepage$")
	public void user_ualready_is_in_homepage() throws Throwable {
		driver = new ChromeDriver();
		startTest();
		user1= new HomePageFunctions(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
	}
	@When("^User clicks on Motorcycle$")
	public void user_clicks_on_Motorcycle() throws Throwable {
		  System.out.println("User clicked on Motorcycle..");
		  user1.motorcycle();
		  captureScreenshot(driver);
	}

	@Then("^System should navigates to motorcyle window for entering data$")
	public void system_should_navigates_to_motorcyle_window_for_entering_data() throws Throwable {
		  System.out.println("system showed form for filling motorcycle data..");
		  writetoTest();
		  endTest();
		  user1.close();
	}
}
