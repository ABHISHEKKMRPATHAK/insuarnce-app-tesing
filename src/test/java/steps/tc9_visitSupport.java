package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePageFunctions;
import utilities.reports;

public class tc9_visitSupport extends reports{
	WebDriver driver;
	HomePageFunctions user1;
	@Given("^User ..already is in homepage$")
	public void user_already_is_in_homepage() throws Throwable {
		driver = new ChromeDriver();
		startTest();
		user1= new HomePageFunctions(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
	}

	@When("^User clicks on visit support$")
	public void user_clicks_on_visit_support() throws Throwable {
		  System.out.println("User clicked on visit support..");
		  user1.visitSupport();
		  captureScreenshot(driver);
	}

	@Then("^System should navigates to visit support page$")
	public void system_should_navigates_to_visit_support_page() throws Throwable {
		  System.out.println("System navigated to visit support page..");
		  writetoTest();
			 endTest();
		  user1.close();
}
}