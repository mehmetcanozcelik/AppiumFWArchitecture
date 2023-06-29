package androidautomation.page;
import androidautomation.base.BasePage;
import io.appium.java_client.AppiumDriver;


import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class reorderPage extends BasePage{

    Duration toWait = Duration.ofSeconds(25);
    AppiumDriver driver = getAppiumDriver();

    public reorderPage(AppiumDriver driver){
        super(driver);
    }

    public reorderPage clickOrders(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(ordersButtonBN);
        infoLog("Orders button on the Bottom Navigation bar has been clicked.");
        return this;
    }

    public reorderPage reorder() throws InterruptedException {
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(reorderButton);
        infoLog("Reorder button has been clicked.");
        return this;
    }

    public reorderPage addtoBasket() throws InterruptedException {
        Thread.sleep(25000);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(reorderButton);
        infoLog("Reorder button has been clicked.");
        Thread.sleep(5000);
        return this;
    }





}
