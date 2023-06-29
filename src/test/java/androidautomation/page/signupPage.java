package androidautomation.page;

import androidautomation.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.SkipException;

import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class signupPage extends BasePage{
    Duration toWait = Duration.ofSeconds(5);
    AppiumDriver driver = getAppiumDriver();

    public signupPage(AppiumDriver driver){
        super(driver);
    }

    // Update Later Case method.
    public signupPage updateLater(){

        driver.manage().timeouts().implicitlyWait(toWait);
        if(driver.findElement(updatePopUp).isDisplayed()){
            driver.manage().timeouts().implicitlyWait(toWait);
            click(updateLaterBtn);

        }
        else{
            System.out.println("The update pop-up has not been shown.");
            throw new SkipException("Skipping this exception.");


        }

        return this;

    }


    // Location will not be selected.

    public signupPage locationCancel(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(locationCancelBtn);
        return this;

    }

    // Click Login/Signup button.

    public signupPage clickLoginSignup(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(loginButton);
        return this;
    }

    //Click SignUp section on the top.

    public signupPage clickSignUpOnTop(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(signUpSection);
        return this;
    }

    //Fill the Name fields.

    public signupPage fillFirstName(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(firstNameTextField, firstName);
        return this;
    }

    public signupPage fillLastName(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(lastNameTextField, lastName);
        return this;
    }

    // Click to Select Flag for mobile number.

    public signupPage changeCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(flagSelection);
        return this;
    }

    // Type your country to find.

    public signupPage findCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(countrySelection, country);
        return this;
    }

    // If country is selectable, it will be selected as default country.

    public signupPage selectOrCloseCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        if(driver.findElement(countryTextFieldCheck).isDisplayed()){
            driver.manage().timeouts().implicitlyWait(toWait);
            click(countryTextFieldCheck);

        }
        else{
            driver.manage().timeouts().implicitlyWait(toWait);
            click(closeButton);
        }
        return this;
    }

    // After the country selection, mobile number will be entered.
    public signupPage mobileNumberEnter(){

        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(mobileNumberTextField, mobileNumber);
        return this;
    }

    // Email will be entered.
    public signupPage emailEnter(){

        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(emailTextField, email);
        return this;
    }


    // Password will be entered.
    public signupPage passwordEnter(){

        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(passwordTextField, password);
        return this;
    }

    // Swipe down the screen.

    public signupPage swipeDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(toWait);
        swipe(914,1853,914,755);
        return this;

    }

    // Close SMS notifications.

    public signupPage closeSMSNotifications(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(allowSmsNotificationField);
        return this;
    }

    // Create your account.
    public signupPage createYourAccount() {
        driver.manage().timeouts().implicitlyWait(toWait);
        click(buttonSubmit);
        return this;
    }

}
