package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class enterVehicleData {

WebDriver driver;
By motorcycle = By.linkText("Motorcycle");
By enterMotorcycleData = By.id("entervehicledata");
By make = 	    By.name("Make") ;
By Model =       By.name("Model");
By CylinderCapacity =By.name("Cylinder Capacity");
By  EnginePerformance =By.name("[kW]");
By DateOfManufacture = By.name("Date of Manufacture");
By NumberOfSeats =        By.name("Number of Seats Motorcycle");
By listPrice = By.name("List Price");
By AnnualMileage = By.name("Annual Mileage");

public enterVehicleData(WebDriver driver) {
	this.driver =driver ;
}

public void motorcycle() {
	driver.findElement(motorcycle).click();
}

public void  enterMotorcycleData() {
	driver.findElement(enterMotorcycleData).click();
}

public void  Make(String s) {
	driver.findElement(make).sendKeys(s);
	
}
public void Model(String s) {
	driver.findElement(Model).sendKeys(s);
}
public void CylinderCapacity(String s) {
	driver.findElement(CylinderCapacity).sendKeys(s);;
}
public void EnginePerformance(String s) {

	driver.findElement(EnginePerformance).sendKeys(s);
}
public void DateOfManufacture(String s) {
	driver.findElement(DateOfManufacture).sendKeys(s);
	
}
public void NumberOfSeats(String s) {
	driver.findElement(NumberOfSeats).sendKeys(s);;

}
public void listPrice(String s) {
	driver.findElement(listPrice).sendKeys(s);;
}
public void AnnualMileage(String s) {
	driver.findElement(AnnualMileage).sendKeys(s);;
}
public void ClickNext() {
	driver.findElement(By.id("nextenterinsurantdata")).click();
}
public void Close() {
	driver.quit();
}
}