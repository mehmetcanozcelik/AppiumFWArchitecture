package androidautomation.test;
import androidautomation.base.BaseTest;
import androidautomation.page.dailyTestPLP;

import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;
import androidautomation.base.Retry;
import java.time.Duration;
public class dailyPLPTest extends BaseTest{
    Duration toWait = Duration.ofSeconds(5);
    dailyTestPLP dailyTestPLP;

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
        dailyTestPLP = new dailyTestPLP(getAppiumDriver());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);
        dailyTestPLP
                .selectDeliveryDetails()
                .swipeMenu()
                .selectProduct()
                .changeBranch();
    }

    @AfterClass
    public void after(){
        tearDown();
    }

}
