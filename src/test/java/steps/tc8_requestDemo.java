package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePageFunctions;
import utilities.reports;

public class tc8_requestDemo extends reports{
	WebDriver driver;
	HomePageFunctions user1;
	@Given("^User is in. home page of the application$")
	public void user_is_in_home_page_of_the_application() throws Throwable {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		startReport();
		user1= new HomePageFunctions(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
		startTest();
	}

	@When("^User clicks on request demo option$")
	public void user_clicks_on_request_demo_option() throws Throwable {
	   System.out.println("User clicked on request demo..");
	   user1.requestDemo();
	   captureScreenshot(driver);
	}

	@Then("^Sytem navigates to request demo page$")
	public void sytem_navigates_to_request_demo_page() throws Throwable {
		  System.out.println("System navigated to request demo page..");
		  endTest();
		  user1.close();
		  
	}
}
