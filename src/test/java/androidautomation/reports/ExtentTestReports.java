package androidautomation.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import static androidautomation.constants.Constants.*;

public class ExtentTestReports {

    public static ExtentReports extent = new ExtentReports();

    public static void beforeTest(){
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportName);
        extent.attachReporter(htmlReporter);

    }
    public static void afterTest(){
        extent.flush();
    }
}
