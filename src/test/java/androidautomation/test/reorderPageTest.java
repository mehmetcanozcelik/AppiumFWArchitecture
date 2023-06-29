package androidautomation.test;
import androidautomation.base.BaseTest;

import androidautomation.page.reorderPage;
import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;

import java.time.Duration;
public class reorderPageTest extends BaseTest{
    Duration toWait = Duration.ofSeconds(15);
    reorderPage reorderPage;

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
        reorderPage = new reorderPage(getAppiumDriver());
    }

    @Test
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);

        reorderPage
                .clickOrders()
                .reorder()
                .addtoBasket();

    }

    @AfterClass
    public void after(){
        tearDown();
    }
}
