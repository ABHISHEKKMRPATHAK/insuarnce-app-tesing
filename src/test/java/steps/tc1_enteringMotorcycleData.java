package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.enterVehicleData;
import utilities.reports;


public class tc1_enteringMotorcycleData extends reports {
	WebDriver driver;
	enterVehicleData Motorcycle;
		@Given("^when the user in enter vehicle data window$")
		public void when_the_user_in_enter_vehicle_data_window() throws Throwable {
		
			WebDriver driver = new ChromeDriver();
			startTest();
			driver.get("http://sampleapp.tricentis.com");
			Motorcycle  = new enterVehicleData(driver);
			Motorcycle.motorcycle();
			Motorcycle.enterMotorcycleData();
			
		}

		@When("^he enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void he_enters(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
		   System.out.println("TESTING ENTERING MOTORCYCLE DATA");
			Motorcycle.Make(arg1);
		    Motorcycle.Model(arg2);
		    Motorcycle.CylinderCapacity(arg3);
		    Motorcycle.EnginePerformance(arg4);
		    Motorcycle.DateOfManufacture(arg5);
		    Motorcycle.NumberOfSeats(arg6);
		    Motorcycle.listPrice(arg7);
		    Motorcycle.AnnualMileage(arg8);
		    captureScreenshot(driver);
		  
		}

		@Then("^the system enter vehicle data it$")
		public void the_system_enter_vehicle_data_it() throws Throwable {
			 System.out.println("TESTING COMPLETED FOR MOTORCYCLE..");
			  writetoTest();
			    endTest();
			Motorcycle.Close();
	
			   
		}

}
