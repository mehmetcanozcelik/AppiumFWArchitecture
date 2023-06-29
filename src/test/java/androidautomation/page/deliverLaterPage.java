package androidautomation.page;
import androidautomation.base.BasePage;

import io.appium.java_client.AppiumDriver;


import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class deliverLaterPage extends BasePage {

    Duration toWait = Duration.ofSeconds(10);
    AppiumDriver driver = getAppiumDriver();

    public deliverLaterPage(AppiumDriver driver){
        super(driver);
    }

    public deliverLaterPage selectDeliveryDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        click(changeDeliveryAddressButton);
        infoLog("'Delivering to' button is clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(selectDoorDeliveryButton);
        infoLog("Select delivery type button is clicked.");
        swipe(700,1910,700,254);
        infoLog("Page is swiped down to see Delivery time options.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(deliverLaterButton);
        infoLog("Deliver Later option has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(504,1648,504,1498);
        infoLog("Day has been changed.");
        swipe(936,1153,936,1865);
        infoLog("Hour has been changed. WE ARE NOT ABLE TO SELECT A TIME OUT of BRANCH OPERATION HOURS.");
        Thread.sleep(2000);
        click(confirmButton);
        infoLog("Confirm button is clicked.");

        return this;
    }

    public deliverLaterPage checkDeliveryInfo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        Thread.sleep(4000);
        click(myCartButtonBN);
        infoLog("My Cart button on the Bottom Navigation is clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(buttonSubmit);
        infoLog("Checkout button is clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(secondStepImageView);
        infoLog("Delivery Info button on the top is clicked to see Delivery details.");
        swipe(700,2080,700,600);
        swipe(700,2080,700,600);
        infoLog("Page is swiped down to check delivery time details.");
        Thread.sleep(3000);
        passLog("Delivery time is correct. Test is passed.");
        return this;
    }
}
