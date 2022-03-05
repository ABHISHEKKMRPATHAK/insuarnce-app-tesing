package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sendQuote {
	WebDriver driver;

	public sendQuote(WebDriver driver) {
		this.driver = driver;
	}
	public void Email(String s) {
		driver.findElement(By.id("email")).sendKeys(s);
	}
	public void phone(String s) {
		driver.findElement(By.id("phone")).sendKeys(s);
	}
	public void username(String s) {
		driver.findElement(By.id("username")).sendKeys(s);
	}
	public void password(String s) {
		driver.findElement(By.id("password")).sendKeys(s);
	}
	public void confirmPassword(String s) {
		driver.findElement(By.id("confirmpassword")).sendKeys(s);
	}
	public void Comments(String s) {
		driver.findElement(By.id("Comments")).sendKeys(s);
	}
	public void sendToQuote() {
		driver.findElement(By.id("sendmail"));
	}
	public void Close() {
		driver.quit();
	}
	public void mainPage() {
		driver.findElement(By.xpath("//*[@id=\"backmain\"]/span")).click();
	}
	public void newTruckInsurance() {
		driver.findElement(By.xpath("//*[@id=\"newtruckinsurance\"]/span"));
	}
	public void newCamperInsurance() {
		driver.findElement(By.xpath("//*[@id=\"newcamperinsurance\"]/span"));
	}
	public void newAutomobileInsurance() {
		driver.findElement(By.xpath("//*[@id=\"newautomobileinsurance\"]/span/i"));
	}
	public void newMotorcycleInsurance() {
		driver.findElement(By.xpath("//*[@id=\"newmotorcycleinsurance\"]/span/i"));
	}
}
