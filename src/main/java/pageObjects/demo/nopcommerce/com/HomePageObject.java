package pageObjects.demo.nopcommerce.com;

import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.demo.nopcommerce.com.HomePageUI;

public class HomePageObject extends BasePage {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver=driver;
    }

    public RegisterPageObject clickOnRegisterField() {
        waitForElementVisible(driver, HomePageUI.REGISTER_FIELD);
        clickOnElement(driver, HomePageUI.REGISTER_FIELD);
        return PageGeneratorManager.getRegisterPage(driver);
    }



}
