package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extent;
	
	public static ExtentReports getReportObject(){
		String path = System.getProperty("user.dir")+"/reports/extentReportIndex.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("WEB AUTOMATION RESULTS");
		reporter.config().setDocumentTitle("Saroj Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","SAROJ");
		return extent;
	}

}
