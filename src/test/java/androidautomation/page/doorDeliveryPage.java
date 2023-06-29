package androidautomation.page;
import androidautomation.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.SkipException;

import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class doorDeliveryPage extends BasePage{

    Duration toWait = Duration.ofSeconds(5);
    AppiumDriver driver = getAppiumDriver();

    public doorDeliveryPage(AppiumDriver driver){
        super(driver);
    }


    // Click "Delivering to" to change location.

    public doorDeliveryPage clickDeliveringTo(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(changeDeliveryAddressButton);
        infoLog("'Delivering to' button is clicked.");
        return this;
    }

    public doorDeliveryPage selectDeliveryType(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(selectDoorDeliveryButton);
        infoLog("Select delivery type button is clicked.");
        return this;
    }

    public doorDeliveryPage deliverDifferentLocation(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(deliverDifferentLocButton);
        infoLog("Deliver Different Location button is clicked.");
        return this;
    }

    public doorDeliveryPage changeAddress(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(searchAddressTextField,testAddress);
        infoLog("Test address has been entered.");
        return this;
    }

    public doorDeliveryPage selectAddressSuggestion(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(testAddressSelect);
        infoLog("Test address has been selected.");
        return this;
    }

    public doorDeliveryPage changeExactLocation() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(87,1045,1249,1053);
        infoLog("Exact location has been changed.");
        return this;
    }

    public doorDeliveryPage clickSelectLocation() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(toWait);
        click(selectLocationButton);
        infoLog("Location has been selected exactly.");
        return this;
    }

    public doorDeliveryPage changeAddressName(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(addressNameTextField,"aaa");
        infoLog("Name of the Test address has been entered.");
        return this;
    }
    public doorDeliveryPage swipeDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(837,2152,837,354);
        infoLog("Screen is swiped down to see buttons.");
        return this;
    }

    public doorDeliveryPage swipeDownFromMiddle() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(865,1636,865,306);
        infoLog("Screen is swiped down to see buttons.");
        return this;
    }

    public doorDeliveryPage saveAddress(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(saveLocationButton);
        infoLog("Location has been saved.");
        return this;
    }

    public doorDeliveryPage confirmAddress(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(confirmButton);
        infoLog("Location has been confirmed.");
        return this;
    }

    public doorDeliveryPage selectFirstProduct(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(testProduct1);
        infoLog("First product has been selected.");
        return this;
    }

    public doorDeliveryPage selectSecondProduct(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(testProduct2);
        infoLog("Second product has been selected.");
        return this;
    }

    public doorDeliveryPage selectExtras(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(testCustomizable1);
        infoLog("Customizable item of Product2 has been selected.");
        return this;
    }

    public doorDeliveryPage addProduct(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(addProductButton);
        infoLog("Product2 has been added to cart.");
        return this;
    }

    public doorDeliveryPage goToCart(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(myCartButtonBN);
        infoLog("Cart button is clicked.");
        return this;
    }

    public doorDeliveryPage checkout(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(checkoutButton);
        infoLog("Checkout button is clicked.");
        return this;
    }


}
