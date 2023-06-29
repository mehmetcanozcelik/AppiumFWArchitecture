package androidautomation.test;
import androidautomation.base.BaseTest;



import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;
import androidautomation.page.checkoutPage;

import java.time.Duration;
public class checkoutPageTest extends BaseTest{
    Duration toWait = Duration.ofSeconds(5);
    checkoutPage checkoutPage;

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
        checkoutPage = new checkoutPage(getAppiumDriver());
    }

    @Test
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);

        checkoutPage
                .clickCart()
                .increaseItem()
                .swipeDown()
                .enterNote()
                .clickCheckout()
                .selectCardPayfort()
                .fillCreditCardDetails()
                .confirmPayment()
                .swipeDown()
                .swipeDown()
                .placeMyOrder();


    }

    @AfterClass
    public void after(){
        tearDown();
    }


}
