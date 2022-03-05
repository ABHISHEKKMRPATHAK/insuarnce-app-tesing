package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.enterInsurantData;
import pageObjects.enterProductData;
import pageObjects.enterVehicleData;
import utilities.reports;

public class tc4_selectPriceOptions extends reports{
	WebDriver driver;
	
	enterVehicleData Motorcycle;
	enterInsurantData Insurant;
	enterProductData Product;
	@Given("^User already entered vehicle data , insurant data and product data$")
	public void user_already_entered_vehicle_data_insurant_data_and_product_data() throws Throwable {
		driver = new ChromeDriver();
		startTest();
		Motorcycle = new enterVehicleData(driver);
		Insurant = new enterInsurantData(driver);
		Product = new enterProductData(driver);
		driver.get("http://sampleapp.tricentis.com");
		    Motorcycle.motorcycle();
		    Motorcycle.Make("Audi");
		    Motorcycle.Model("Motorcycle");
		    Motorcycle.CylinderCapacity("500");
		    Motorcycle.EnginePerformance("1000");
		    Motorcycle.DateOfManufacture("01/20/2022");
		    Motorcycle.NumberOfSeats("2");
		    Motorcycle.listPrice("60000");
		    Motorcycle.AnnualMileage("30000");
		    Motorcycle.ClickNext();
		    
		     
		     Insurant.firstname("Ram");
		     Insurant.lastName("Kumar");
		     Insurant.dateOfBirth("10/10/1978");
		     Insurant.streetAddresss("Magarpatta");
		     Insurant.country("India");
		     Insurant.zipcode("220032");
		     Insurant.city("Pune");
		     Insurant.occupation("Employee");
		     driver.findElement(By.cssSelector(".field:nth-child(10) .ideal-radiocheck-label:nth-child(1)")).click();
		     Insurant.ClickNext();

		        Product.startDate("04/15/2022");
				Product.insuranceSum("5.000.000,00");
			
				Product.damageInsurance("No Coverage");
				Product.optionalProducts();
			
				Product.ClickNext();
	}

	@When("^User selects one of the price options$")
	public void user_selects_one_of_the_price_options() throws Throwable {
		driver.findElement(By.cssSelector(".choosePrice:nth-child(2) > .ideal-radio")).click();
		captureScreenshot(driver);
	
	}

	@Then("^Sytem accepts the price option$")
	public void sytem_accepts_the_price_option() throws Throwable {
		  System.out.println("Price Option selected successfully");
		  driver.quit();
		  writetoTest();
		  endTest();
		
	}

}
