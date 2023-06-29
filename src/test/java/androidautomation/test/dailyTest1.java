package androidautomation.test;
import androidautomation.base.BaseTest;
import androidautomation.page.dailyTest1Page;
import androidautomation.page.loginPage;
import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;

import java.time.Duration;
public class dailyTest1 extends BaseTest{
    Duration toWait = Duration.ofSeconds(5);
    dailyTest1Page dailyTest1Page;


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
        dailyTest1Page = new dailyTest1Page(getAppiumDriver());
    }

    @Test
    public void test(){

        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);

        dailyTest1Page
                .updateLater()
                .locationCancel()
                .clickLoginSignup()
                .clickForgetPassword()
                .changeCountry()
                .findCountry()
                .selectOrCloseCountry()
                .mobileNumberEnter()
                .clickSendReset();
    }
    @AfterClass
    public void after(){
        tearDown();
    }
}
