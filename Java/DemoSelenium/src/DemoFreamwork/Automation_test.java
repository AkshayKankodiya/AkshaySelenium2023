package JAVA_Pract.DemoFreamwork;

import JAVA_Pract.DriverFact.BrowserAction;
import JAVA_Pract.DriverFact.ConstantData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Automation_test {
    public WebDriver driver;
    Automation_Page page;

    @BeforeClass
    public void setup() {
        BrowserAction browserAction = new BrowserAction();
        driver = browserAction.openBrowser();
        page = new Automation_Page(driver);

    }

    @Test(priority = 0)
    public void setupBrowsertest() throws InterruptedException {
        page.setupBrowserpage();
    }

    @Test(priority = 1)
    public void randomEmailtest() throws InterruptedException {
        page.randomEmailPage();

    }

    @Test(priority = 2)
    public void fillFormTest() throws InterruptedException {
        page.fillFormPage();

        /*page.clickSetting(page.radioBtnMale);
        page.inputtext(page.fNameTextbox, ConstantData.FIRSTNAME);*/
    }


   /* @AfterClass
    public void closeDriver() {
        driver.quit();
    }*/

}
