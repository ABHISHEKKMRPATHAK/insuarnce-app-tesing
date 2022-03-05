package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterProductData {
		WebDriver driver;
		public enterProductData(WebDriver driver) {
			this.driver = driver;
		}
		public void selectEnterProductData() {
			driver.findElement(By.id("enterproductdata")).click();
		}
		public void  startDate(String s) {
			driver.findElement(By.id("startdate")).sendKeys(s);
		}
		public void insuranceSum(String s) {
			driver.findElement(By.id("insurancesum")).sendKeys(s);	
		
		}
		public void damageInsurance(String s) {
			driver.findElement(By.id("damageinsurance")).sendKeys(s);
		}
		public void optionalProducts() {
			driver.findElement(By.cssSelector(".field:nth-child(4) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
		}
		public void ClickNext() {
			driver.findElement(By.id("nextselectpriceoption")).click();
		}
		public void Close() {
			driver.quit();
		}
}
