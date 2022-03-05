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
import pageObjects.sendQuote;
import utilities.reports;

public class tc16_buyAgainMotorcycleInsurance extends reports{
	WebDriver driver;
	enterVehicleData Motorcycle;
	enterInsurantData Insurant;
	enterProductData Product;
	sendQuote user1;

@Given("^User alraedy bought a motorcycle insurance$")
public void user_alraedy_bought_a_motorcycle_insurance() throws Throwable {
	driver = new ChromeDriver();
	startTest();
	Motorcycle = new enterVehicleData(driver);
	Insurant = new enterInsurantData(driver);
	Product = new enterProductData(driver);
	user1 = new sendQuote(driver);
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
			Thread.sleep(5000);
			driver.findElement(By.id("nextsendquote")).click();
			user1.Email("ramkumar@gmail.com");
		    user1.phone("8787454546");
		    user1.username("ram001");
		    user1.password("Qwerty12345678@");
		    user1.confirmPassword("Qwerty12345678@");
		    user1.Comments("good service ...");
}

@When("^User clicks on Motorcycle Insurance$")
public void user_clicks_on_Motorcycle_Insurance() throws Throwable {
	System.out.println("Redirecting to Motorcycle Insurance Page..");
	user1.newMotorcycleInsurance();
	captureScreenshot(driver);
}

@Then("^system again show form to fill data for motorcycle$")
public void system_again_show_form_to_fill_data_for_motorcycle() throws Throwable {
   System.out.println("you are in Motorcycle insurance page");
   Thread.sleep(5000);
	  writetoTest();
   user1.Close();
   endTest();
	
}
}
