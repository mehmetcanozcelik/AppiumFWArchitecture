package androidautomation.page;
import androidautomation.base.BasePage;

import io.appium.java_client.AppiumDriver;


import java.time.Duration;

import static androidautomation.constants.Constants.*;

public class dailyTestPLP extends BasePage {
    Duration toWait = Duration.ofSeconds(10);
    AppiumDriver driver = getAppiumDriver();

    public dailyTestPLP(AppiumDriver driver){
        super(driver);
    }


    public dailyTestPLP selectDeliveryDetails(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(changeDeliveryAddressButton);
        infoLog("'Delivery Details' submenu button is clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(selfPickupSelection);
        infoLog("'Self Pickup' has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(chooseDifferentBrachButton);
        infoLog("'Choose Different Branch' has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(specificBranch);
        infoLog("'SPECIFIC' branch has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(confirmButton);
        infoLog("Confirm button has been clicked.");
        return this;
    }

    public dailyTestPLP swipeMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(1244,1994,37,1994);
        infoLog("Menu has been swiped from right to left.");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(DipsMenu);
        infoLog("'Dips' submenu has been selected.");
        return this;
    }

    public dailyTestPLP selectProduct() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        click(addButton);
        infoLog("First product has been selected.");
        Thread.sleep(3000);
        click(increaseItemNumber);
        infoLog("Number of item has been increased.");
        Thread.sleep(1000);
        click(myCartButtonBN);
        infoLog("'Cart' on the Bottom Navigation has been clicked.");
        Thread.sleep(4000);
        click(homeButtonBN);
        infoLog("'Home' on the Bottom Navigation has been clicked.");
        return this;

    }

    public dailyTestPLP changeBranch() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(749,533,749,2123);
        swipe(749,533,749,2123);
        swipe(749,533,749,2123);
        swipe(749,533,749,2123);
        swipe(749,533,749,2123);
        infoLog("Page has been swiped up to change the Branch.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(changeDeliveryAddressButton);
        infoLog("'Delivery Details' submenu button is clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(selfPickupSelection);
        infoLog("'Self Pickup' has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(chooseDifferentBrachButton);
        infoLog("'Choose Different Branch' has been selected.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(TheCornerBranch);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(confirmButton);
        infoLog("Confirm button has been clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(buttonPositive);
        infoLog("Clear Basket button has been clicked.");
        Thread.sleep(1000);
        click(myCartButtonBN);
        infoLog("'Cart' on the Bottom Navigation has been clicked.");
        driver.manage().timeouts().implicitlyWait(toWait);
        click(addProductOnBasketPageButton);
        infoLog("'Add Product' on the Bottom Navigation has been clicked.");
        Thread.sleep(1000);

        return this;



    }




}
