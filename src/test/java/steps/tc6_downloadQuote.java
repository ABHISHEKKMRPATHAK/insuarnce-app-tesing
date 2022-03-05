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

public class tc6_downloadQuote extends reports{
WebDriver driver;
	
	enterVehicleData Motorcycle;
	enterInsurantData Insurant;
	enterProductData Product;
	@Given("^user enter all the data and select one of the the price options$")
	public void user_enter_all_the_data_and_select_one_of_the_the_price_options() throws Throwable {
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
				driver.findElement(By.cssSelector(".choosePrice:nth-child(2) > .ideal-radio")).click();
				
	}
	@When("^User clicks on download quote$")
	public void user_clicks_on_download_quote() throws Throwable {
		Thread.sleep(15000);
		 driver.findElement(By.cssSelector("#downloadquote .fa")).click();
		 System.out.println("Downloading started...");
		 captureScreenshot(driver);
		Thread.sleep(10000);
	}

	@Then("^system will generate the quote and download in the user's system$")
	public void system_will_generate_the_quote_for_the_user() throws Throwable {
	   System.out.println("quote downloaded sucessfully");
	   Product.Close();
		  writetoTest();
	   endTest();
	
	}


}
