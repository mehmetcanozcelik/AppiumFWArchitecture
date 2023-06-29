package androidautomation.test;
import androidautomation.base.BaseTest;

import androidautomation.base.Retry;
import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;
import androidautomation.page.doorDeliveryPage;

import java.time.Duration;
public class doorDeliveryPageTest extends BaseTest{
    Duration toWait = Duration.ofSeconds(5);
    doorDeliveryPage doorDeliveryPage;

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
        doorDeliveryPage = new doorDeliveryPage(getAppiumDriver());
    }


    @Test(retryAnalyzer = Retry.class)
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);
        doorDeliveryPage
                .clickDeliveringTo()
                .selectDeliveryType()
                .deliverDifferentLocation()
                .changeAddress()
                .selectAddressSuggestion()
                .changeExactLocation()
                .clickSelectLocation()
                .changeAddressName()
                .swipeDown()
                .saveAddress()
                .confirmAddress()
                .swipeDown()
                .selectFirstProduct()
                .swipeDown()
                .selectSecondProduct()
                .selectExtras()
                .addProduct()
                .goToCart()
                .swipeDownFromMiddle()
                .checkout();

    }

    @AfterClass
    public void after(){
        tearDown();
    }

}
