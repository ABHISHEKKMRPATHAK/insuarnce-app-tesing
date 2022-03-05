package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageFunctions {
	WebDriver driver;
	public HomePageFunctions(WebDriver driver) {
		this.driver = driver;
	}
	public void requestDemo() {
		driver.findElement(By.id("downloadtrial")).click();
	}
	public void visitSupport() {
		driver.findElement(By.id("visitsupport")).click();
	}
	public void searchSupport(String s) {
		driver.findElement(By.id("search_form")).sendKeys(s);;
	}
	public void automobile() {
		driver.findElement(By.id("nav_automobile")).click();
	}
	public void motorcycle() {
		driver.findElement(By.id("nav_motorcycle")).click();
	}
	public void camper() {
		driver.findElement(By.id("nav_camper")).click();
	}
	public void truck() {
		driver.findElement(By.id("nav_truck")).click();
	}
	public void close() {
		driver.quit();
		}
	
}
