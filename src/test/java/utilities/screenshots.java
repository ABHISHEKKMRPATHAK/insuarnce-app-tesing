package utilities;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	import com.google.common.io.Files;

	public class screenshots {
		static int j = 1;
	    public static void captureScreenshot(WebDriver driver) throws IOException 
	    {
	        File scrFile;
	        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(scrFile, new File("C:\\Users\\abhishek\\Downloads\\finalProject\\vehicleInsurance\\screenshots screenshot" + j + ".png"));
	        j++;
	    }
	}


