package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.enterProductData;
import pageObjects.enterVehicleData;
import utilities.reports;

public class tc3_enteringProductData extends reports{
	WebDriver driver;
	enterProductData Product1;
	enterVehicleData Motorcycle;
	@Given("^User already filled the insurant data$")
	public void user_already_filled_the_insurant_data() throws Throwable {
		WebDriver driver = new ChromeDriver();
		startTest();
		Motorcycle  = new enterVehicleData(driver);
		Product1 = new enterProductData(driver);
		driver.get("http://sampleapp.tricentis.com");
		Motorcycle.motorcycle();
		Product1.selectEnterProductData();
	}

	@When("^Users enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void users_enters(String arg1, String arg2, String arg3) throws Throwable {
		 System.out.println("Testing foe entering product details...");
		Product1.startDate(arg1);
		Product1.insuranceSum(arg2);
		Product1.damageInsurance(arg3);
		Product1.optionalProducts();
		captureScreenshot(driver);
	   	}

	@Then("^System accepts the details of product and navigates forward$")
	public void system_accepts_the_details_of_product_and_navigates_forward() throws Throwable {
	    System.out.println("Product Data entered successfully...");
	Product1.Close();
	  writetoTest();
	endTest();

	}
}
