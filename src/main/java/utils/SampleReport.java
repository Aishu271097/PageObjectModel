package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	
	public void generateReport() {
		
		//Start Report
		
		ExtentReports  report= new ExtentReports("./reports/Result.html" , false);
		
		
		//Start test
		ExtentTest test = report.startTest("TC003", "To verify IRCTC Registration for the new user signup");
		
		
				//log steps
		
		test.log(LogStatus.PASS, "The browser got launched with the url successfully");
		test.log(LogStatus.PASS, "The browser got launched with the url successfully");
		test.log(LogStatus.PASS, "The browser got launched with the url successfully");
		test.log(LogStatus.PASS, "The browser got launched with the url successfully");
		test.log(LogStatus.PASS, "The browser got launched with the url successfully");
		
		
		test.assignAuthor("Sujatha");
		test.assignCategory("Functional");
		
		//end Test
		
		report.endTest(test);
		
		//end Report
		
		report.flush();
		
		
		
		
		
	}
	
	
	
	
}
