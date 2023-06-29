package androidautomation.test;
import androidautomation.base.BaseTest;

import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;
import androidautomation.base.Retry;
import java.time.Duration;

import androidautomation.page.deliverLaterPage;
public class deliverLaterTest extends BaseTest{
    Duration toWait = Duration.ofSeconds(5);
    deliverLaterPage deliverLaterPage;

    @BeforeSuite
    public void setupSuite(){
        ExtentTestReports.beforeTest();

    }

    @AfterSuite
    public void afterSuite(){
        ExtentTestReports.afterTest();
    }

    @BeforeClass
    public void before(){
        deliverLaterPage = new deliverLaterPage(getAppiumDriver());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);
        deliverLaterPage
                .selectDeliveryDetails()
                .checkDeliveryInfo()
        ;
    }
    @AfterClass
    public void after(){
        tearDown();
    }
}
