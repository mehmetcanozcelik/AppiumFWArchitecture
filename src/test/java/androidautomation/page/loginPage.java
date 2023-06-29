package androidautomation.page;

import androidautomation.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.SkipException;

import java.time.Duration;

import static androidautomation.constants.Constants.*;

public class loginPage extends BasePage {
    Duration toWait = Duration.ofSeconds(5);
    AppiumDriver driver = getAppiumDriver();

    public loginPage(AppiumDriver driver){
        super(driver);
    }

    // Update Later Case method.
    public loginPage updateLater(){

        driver.manage().timeouts().implicitlyWait(toWait);
        if(driver.findElement(updatePopUp).isDisplayed()){
            driver.manage().timeouts().implicitlyWait(toWait);
            click(updateLaterBtn);

        }
        else{
            infoLog("Update pop-up has not been shown and this test is skipped.");
            throw new SkipException("Skipping this exception.");


        }
        infoLog("There is an update but it is discarded for now.");
        return this;

    }


    // Location will not be selected.

    public loginPage locationCancel(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(locationCancelBtn);
        infoLog("Location will be entered later, location select is discarded.");
        return this;

    }

    // Click Login/Signup button.

    public loginPage clickLoginSignup(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(loginButton);
        infoLog("Login/SignUp button is clicked.");
        return this;
    }

    // Click to Select Flag for mobile number.

    public loginPage changeCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(flagSelection);
        infoLog("Country will be changed via clicking the Flag button.");
        return this;
    }

    // Type your country to find.

    public loginPage findCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(countrySelection, country);
        infoLog("Country is entered in related text field.");
        return this;
    }

    // If country is selectable, it will be selected as default country.

    public loginPage selectOrCloseCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        if(driver.findElement(countryTextFieldCheck).isDisplayed()){
            driver.manage().timeouts().implicitlyWait(toWait);
            click(countryTextFieldCheck);
            infoLog("Relevant country is selected.");

        }
        else{
            driver.manage().timeouts().implicitlyWait(toWait);
            click(closeButton);
            infoLog("Relevant country is not found. Close button is clicked.");
        }
        return this;
    }

    // After the country selection, mobile number will be entered.
    public loginPage mobileNumberEnter(){

        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(mobileNumberTextField, mobileNumber);
        infoLog("Mobile number is entered.");
        return this;
    }

    // Password will be entered.
    public loginPage passwordEnter(){

        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(passwordTextField, password);
        infoLog("Password is entered.");
        return this;
    }

    // Click the Login button.
    public loginPage loginClick(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(loginButton);
        infoLog("Login button is clicked.");
        passLog("Test is passed.");
        return this;
    }



}
