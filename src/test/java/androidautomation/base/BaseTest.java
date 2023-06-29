package androidautomation.base;

import androidautomation.reports.ExtentTestReports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest extends ExtentTestReports {

    public static AppiumDriver appiumDriver ;
    public static WebDriverWait wait;


    @BeforeClass

    public void setup(){

        try{

            DesiredCapabilities cap;
            cap = new DesiredCapabilities();


            cap.setCapability("appium:deviceName", "Nexus 6 API 28");
            cap.setCapability("appium:platformName", "Android");
            cap.setCapability("appium:udid", "emulator-5554");
            cap.setCapability("appium:platformVersion", "9.0");
            cap.setCapability("appium:appPackage", "com.YOUR.APP.PACKAGE");
            cap.setCapability("appium:appActivity", "com.YOUR.APP.STARTING.ACTIVITY");
            cap.setCapability("appium:skipUnlock", "true");
            cap.setCapability("appium:noReset", "true");
            cap.setCapability("appium:appWaitActivity", "*");

            appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            Duration timeout = Duration.ofSeconds(10);
            wait = new WebDriverWait(appiumDriver,timeout);



        }catch(MalformedURLException mx){
            System.out.println("Wrong URL exception.");

        }





    }

    public static void setAppiumDriver(AppiumDriver appiumDriver){
        BaseTest.appiumDriver = appiumDriver;
    }

    public static AppiumDriver getAppiumDriver(){
        return appiumDriver;
    }



    public void tearDown(){
        getAppiumDriver().quit();
    }



}
