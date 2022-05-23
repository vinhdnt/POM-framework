package pageObjects.demo.nopcommerce.com;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.demo.nopcommerce.com.RegisterPageUI;

public class RegisterPageObject extends BasePage {
    private WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver=driver;
    }

    public void selectGender(String genderValue) {
        waitForElementVisible(driver, RegisterPageUI.GENDER_RADIO_BUTTON, genderValue);
        clickOnElement(driver, RegisterPageUI.GENDER_RADIO_BUTTON, genderValue);

    }

    public void inputFirstNameTextbox(String firstName) {
        waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
    }

    public void inputLastNameTextbox(String lastName) {
        waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
    }

    public void inputEmailTextbox(String email) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputPasswordTextbox(String passWord) {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, passWord);
    }

    public void inputConfirmPasswordTextbox(String passWord) {
        waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, passWord);
    }

    public void clickOnRegisterButton() {
        waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickOnElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public String getRegisterSuccessfulMsg() {
        waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESSFUL_MSG);
        return getElementText(driver, RegisterPageUI.REGISTER_SUCCESSFUL_MSG);
    }
}
