package androidautomation.page;
import androidautomation.base.BasePage;
import io.appium.java_client.AppiumDriver;


import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class checkoutPage extends BasePage{
    Duration toWait = Duration.ofSeconds(5);
    AppiumDriver driver = getAppiumDriver();

    public checkoutPage(AppiumDriver driver){
        super(driver);
    }


    // Click Cart section on the Bottom navigation bar.

    public checkoutPage clickCart(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(myCartButtonBN);
        infoLog("Cart button on the Bottom Navigation bar has been clicked.");
        return this;

    }

    // Increase the item number.

    public checkoutPage increaseItem(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(increaseItemNumber);
        infoLog("Item - Classic Rice Pudding has been increased from 1 to 2.");
        return this;
    }

    public checkoutPage swipeDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(700,1631,700,350);
        infoLog("Screen is swiped down to see other features.");
        return this;

    }

    public checkoutPage enterNote(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(enterNoteButton);
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(enterNoteTextField, testOrderNote);
        infoLog("A note has been added for the order.");
        return this;
    }

    public checkoutPage clickCheckout(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(checkoutButton);
        infoLog("Checkout button has been clicked.");
        return this;
    }

    public checkoutPage selectCardPayfort(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(creditCardPayFortRadioButton);
        infoLog("Credit/Debit Card Payfort option has been selected.");
        return this;
    }

    public checkoutPage fillCreditCardDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(creditcardNameField, nameAndSurname);
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(creditcardCardNumberField,testCreditCardNumber);
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(creditcardMonthYearField, testCreditCardMMYY);
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(creditcardCVCField, testCreditCardCVC);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(switchButton);
        driver.manage().timeouts().implicitlyWait(toWait);
        Thread.sleep(2000);
        click(buttonApply);
        infoLog("Credit/Debit Card details have been added.");
        return this;
    }

    public checkoutPage confirmPayment() throws InterruptedException {
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(buttonConfirm);
        infoLog("Confirm Payment button has been clicked.");
        Thread.sleep(2000);
        return this;
    }

    public checkoutPage placeMyOrder() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        click(checkoutButton);
        infoLog("Place my Order button has been clicked.");
        Thread.sleep(2000);
        return this;
    }





}
