package androidautomation.test;

import androidautomation.base.BaseTest;
import androidautomation.page.signupPage;
import androidautomation.page.loginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
public class signupPageTest extends BaseTest {

    Duration toWait = Duration.ofSeconds(5);
    signupPage signupPage;

    @BeforeClass
    public void before(){
        signupPage = new signupPage(getAppiumDriver());
    }

    @Test
    public void test() throws InterruptedException {
        getAppiumDriver().manage().timeouts().implicitlyWait(toWait);
        signupPage
                .updateLater()
                .locationCancel()
                .clickLoginSignup()
                .clickSignUpOnTop()
                .fillFirstName()
                .fillLastName()
                .changeCountry()
                .findCountry()
                .selectOrCloseCountry()
                .mobileNumberEnter()
                .emailEnter()
                .passwordEnter()
                .swipeDown()
                .closeSMSNotifications()
                .createYourAccount();

    }




    @AfterClass
    public void after(){
        tearDown();
    }
}
