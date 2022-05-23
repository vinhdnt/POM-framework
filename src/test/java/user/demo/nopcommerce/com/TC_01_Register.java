package user.demo.nopcommerce.com;

import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.demo.nopcommerce.com.HomePageObject;
import pageObjects.demo.nopcommerce.com.RegisterPageObject;

public class TC_01_Register extends BaseTest {
    WebDriver driver;
    private String firstName, lastName, email, passWord;

    @Parameters({ "browser","url","ipAddress","port" })
    @BeforeClass
    public void initBrowser(String browserName, String url, String ipAddress, String port) {
        log.info("Pre-condition - Step 01:Init browser and go to Homepage to: " + url);
        driver = getBrowserDriver(browserName, url, ipAddress, port); //init browser driver
        log.info("Browser name and version is: " + getBrowserInitName());
        homePage = PageGeneratorManager.getHomePage(driver); //Go to HomePage

        email = getRandomEmail();
        passWord = "123123123";
        firstName = "FNtest";
        lastName = "LNtest";
    }

    @Test
    public void TC_01_Register_With_Valid_Data() {
        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 1: Click on 'Register' field ");
        registerPage = homePage.clickOnRegisterField();

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 2: Select gender");
        registerPage.selectGender("M");

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 3: Input 'first name' textbox");
        registerPage.inputFirstNameTextbox(firstName);

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 4: Input 'last name' textbox ");
        registerPage.inputLastNameTextbox(lastName);

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 5: Input 'email' textbox ");
        registerPage.inputEmailTextbox(email);

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 6: Input 'password' textbox ");
        registerPage.inputPasswordTextbox(passWord);

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 7: Input 'confirm password' textbox ");
        registerPage.inputConfirmPasswordTextbox(passWord);

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 8: Click on 'Register' field ");
        registerPage.clickOnRegisterButton();

        log.info("TC_01_Register_With_Valid_User_Name_Password - Step 9: Verify register successful msg is displayed ");
        verifyEquals(registerPage.getRegisterSuccessfulMsg(), "Your registration completed");

    }


    @AfterClass(alwaysRun = true)
    public void afterClass() {
        log.info("Close browser");
        cleanBrowserAndDriver();
    }

    HomePageObject homePage;
    RegisterPageObject registerPage;

}
