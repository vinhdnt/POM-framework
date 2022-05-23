package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.demo.nopcommerce.com.HomePageObject;
import pageObjects.demo.nopcommerce.com.RegisterPageObject;

public class PageGeneratorManager {
    private static HomePageObject homePage;
    private static RegisterPageObject registerPage;

    private PageGeneratorManager() {
    }
    public static HomePageObject getHomePage(WebDriver driver) {
        if (homePage==null) {
            return new HomePageObject(driver);
        }
        return homePage;
    }
    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        if (registerPage==null) {
            return new RegisterPageObject(driver);
        }
        return registerPage;
    }
}
