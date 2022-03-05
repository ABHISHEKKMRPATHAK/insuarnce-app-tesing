package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterInsurantData {
	WebDriver driver ;
	By selectInsurantData = By.id("enterinsurantdata");
	By firstName = By.id("firstname");
	By lastName   = By.id("lastname");
	By dateOfBirth = By.id("birthdate");
	By streetAddress = By.id("streetaddress");
	By country = By.id("country");
	By Zipcode = By.id("zipcode");
	By city =  By.id("city");
	By occupation =By.id("occupation");
	By website  = By.id("website");

	public enterInsurantData(WebDriver driver) {
		this.driver = driver;
	}
	public void selectInsurantData() {
		driver.findElement(selectInsurantData).click();
	}

	public void firstname(String s) {
		driver.findElement(firstName).sendKeys(s);
	}
	public void lastName(String s) {
		driver.findElement(lastName).sendKeys(s);
	}
	public void dateOfBirth(String s) {
		driver.findElement(dateOfBirth).sendKeys(s);
	}

	public void streetAddresss(String s) {
		driver.findElement(streetAddress).sendKeys(s);
	}
	public void country(String s) {
		driver.findElement(country).sendKeys(s);
	}
	public void zipcode(String s) {
		driver.findElement(Zipcode).sendKeys(s);
	}
	public void city(String s) {
		driver.findElement(city).sendKeys(s);
	}
	public void occupation(String s) {
		driver.findElement(occupation).sendKeys(s);
	}


	public void website(String s) {
		driver.findElement(website).sendKeys(s);
	}
	public void ClickNext() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}
	public void Close() {
		driver.quit();
	}

}
