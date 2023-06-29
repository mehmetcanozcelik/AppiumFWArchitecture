package androidautomation.test;

import androidautomation.base.BaseTest;
import androidautomation.page.loginPage;
import androidautomation.reports.ExtentTestReports;
import org.testng.annotations.*;

import java.time.Duration;

public class loginPageTest extends BaseTest {
    Duration toWait = Duration.ofSeconds(5);
    loginPage loginPage;


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
        loginPage = new loginPage(getAppiumDriver());
    }

    @Test
    public void test(){
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);
        loginPage
                .updateLater()
                .locationCancel()
                .clickLoginSignup()
                .changeCountry()
                .findCountry()
                .selectOrCloseCountry()
                .mobileNumberEnter()
                .passwordEnter()
                .loginClick();
    }

    @AfterClass
    public void after(){
        tearDown();
    }
}
