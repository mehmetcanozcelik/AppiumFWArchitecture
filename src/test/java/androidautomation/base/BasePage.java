package androidautomation.base;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static androidautomation.constants.Constants.*;

import java.time.Duration;

public class BasePage extends BaseTest {
    AppiumDriver driver;
    WebDriverWait wait;

    public ExtentTest startTest = extent.createTest(testName,testDescription);



    public BasePage(AppiumDriver driver){
        this.driver = driver;
        Duration timeout = Duration.ofSeconds(60);
        this.wait = new WebDriverWait(driver,timeout );
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);

    }

    public void sendKeys(By by, String text){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).sendKeys(text);

    }

    public void click(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).click();
    }

    public void clear(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).clear();
    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return findElement(by).getText();
    }

    public void swipe(int x1,int y1, int x2, int y2) throws InterruptedException {
        Thread.sleep(1000);
        TouchAction swipe = new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(x1, y1))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(x2, y2))
                .release()
                .perform();
    }

    public void infoLog(String str){
        startTest.log(Status.INFO,str);
    }

    public void passLog(String str){
        startTest.log(Status.PASS, str);


    }

    public void failLog(String str){
        startTest.log(Status.FAIL,str);
    }


}
