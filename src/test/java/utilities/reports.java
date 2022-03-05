package utilities;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reports extends screenshots {
	static ExtentReports extent;
    static ExtentTest test;
    static int i = 1;
    
    public void startReport()
    {
    extent = new ExtentReports ("C:\\Users\\abhishek\\Downloads\\finalProject\\vehicleInsurance\\reports/MyReport.html", true);
    }
    public void startTest()
    {
        test = extent.startTest("test"+i);
        
    }
    public void writetoTest()
    {
        test.log(LogStatus.PASS, "Test step is pass");
    }
    public void flush()
    {
    	extent.flush();
    }
   
   
    public void endTest()
    {
        extent.endTest(test);
        i++;
    }
    public void endReport()
    {
        extent.close();
    }
}