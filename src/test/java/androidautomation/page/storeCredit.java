package androidautomation.page;
import androidautomation.base.BasePage;

import io.appium.java_client.AppiumDriver;


import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class storeCredit extends BasePage{

    Duration toWait = Duration.ofSeconds(10);
    AppiumDriver driver = getAppiumDriver();

    public storeCredit(AppiumDriver driver){
        super(driver);
    }


    public storeCredit selectDeliveryDetails() throws InterruptedException {
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

    public storeCredit selectProduct() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(945,1698,945,375);
        infoLog("Page is swiped down to see products.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(FullPlate);
        infoLog("Test product has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(addBasketinProductPage);
        infoLog("Test product has been added to basket.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(myCartButtonBN);
        infoLog("My cart button on the Bottom Navigation has been clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        Thread.sleep(3000);
        click(buttonSubmit);
        infoLog("Checkout button has been clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        String isChecked = findElement(switchButton).getAttribute("checked");
        if(isChecked.equalsIgnoreCase("true")) {
            System.out.println("Checkbox selected");
            infoLog("Store credit is already been using.");
        } else {
            System.out.println("Checkbox is not selected");
            infoLog("Store credit is selected and ready to use.");
            click(switchButton);
        }
        driver.manage().timeouts().implicitlyWait(toWait);
        Thread.sleep(3000);
        click(buttonConfirm);
        infoLog("Confirm button has been clicked.");
        Thread.sleep(3000);
        passLog("Test is completed.");

        return this;

    }
}
