package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.enterInsurantData;
import pageObjects.enterVehicleData;
import utilities.reports;

public class tc2_enteringInsurantData extends reports{
	WebDriver driver;
	enterVehicleData Motorcycle;
	enterInsurantData Insurant;
	@Given("^User already filled the vehicle data$")
	public void user_already_filled_the_vehicle_data() throws Throwable {
		WebDriver driver = new ChromeDriver();
		startTest();
		driver.get("http://sampleapp.tricentis.com");
		
		Motorcycle  = new enterVehicleData(driver);
		Insurant    = new enterInsurantData(driver);
		Motorcycle.motorcycle();
		Insurant.selectInsurantData();
	}
	@When("^User enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
		  System.out.println("TESTING ENTERING INSURANT DATA"); 
		Insurant.firstname(arg1);
	     Insurant.lastName(arg2);
	     Insurant.dateOfBirth(arg3);
	     Insurant.streetAddresss(arg4);
	     Insurant.country(arg5);
	     Insurant.zipcode(arg6);
	     Insurant.city(arg7);
	     Insurant.occupation(arg8);
	     captureScreenshot(driver);

	}

	@Then("^System accepts the details of insurant data$")
	public void system_accepts_the_details_of_insurant_data() throws Throwable {
      System.out.println("Insurant data antered and tested successfully");
      Insurant.Close();
	  writetoTest();
      endTest();

     
	}

}
