package androidautomation.test;
import androidautomation.base.BaseTest;

import androidautomation.page.deliverLaterPage;
import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;
import androidautomation.base.Retry;
import java.time.Duration;

import androidautomation.page.storeCredit;
public class storeCreditTest extends BaseTest{
    Duration toWait = Duration.ofSeconds(5);

    storeCredit storeCredit;
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
        storeCredit = new storeCredit(getAppiumDriver());
    }


    @Test(retryAnalyzer = Retry.class)
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);
        storeCredit
                .selectDeliveryDetails()
                .selectProduct()
        ;
    }
    @AfterClass
    public void after(){
        tearDown();
    }
}
