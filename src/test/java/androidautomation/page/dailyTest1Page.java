package androidautomation.page;
import androidautomation.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.testng.SkipException;

import java.time.Duration;

import static androidautomation.constants.Constants.*;
public class dailyTest1Page extends BasePage{
    Duration toWait = Duration.ofSeconds(5);
    AppiumDriver driver = getAppiumDriver();

    public dailyTest1Page(AppiumDriver driver){
        super(driver);
    }



    public dailyTest1Page updateLater(){

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

    public dailyTest1Page locationCancel(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(locationCancelBtn);
        infoLog("Location will be entered later, location select is discarded.");
        return this;
    }

    public dailyTest1Page clickLoginSignup(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(loginButton);
        infoLog("Login/SignUp button is clicked.");
        return this;
    }

    public dailyTest1Page clickForgetPassword() {
        driver.manage().timeouts().implicitlyWait(toWait);
        click(forgetMyPasswordButton);
        infoLog("Forget my password button is clicked.");
        return this;
    }

    public dailyTest1Page changeCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(flagSelection);
        infoLog("Country will be changed via clicking the Flag button.");
        return this;
    }

    public dailyTest1Page findCountry(){
        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(countrySelection, country);
        infoLog("Country is entered in related text field.");
        return this;
    }

    public dailyTest1Page selectOrCloseCountry(){
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

    public dailyTest1Page mobileNumberEnter(){

        driver.manage().timeouts().implicitlyWait(toWait);
        sendKeys(mobileNumberTextFieldinForgetPassword, mobileNumber);
        infoLog("Mobile number is entered.");
        return this;
    }

    public dailyTest1Page clickSendReset(){
        driver.manage().timeouts().implicitlyWait(toWait);
        click(buttonSubmit);
        infoLog("Country will be changed via clicking the Flag button.");
        return this;
    }










}
