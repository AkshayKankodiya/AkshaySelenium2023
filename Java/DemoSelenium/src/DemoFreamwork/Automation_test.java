package JAVA_Pract.DemoFreamwork;

import JAVA_Pract.DriverFact.BrowserAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Automation_test {
    WebDriver driver;
    Automation_Page page;

    @BeforeClass
    public void setup() {
        BrowserAction browserAction = new BrowserAction();
        driver = browserAction.openBrowser();
        page = new Automation_Page(driver);

    }

    @Test(priority = 0)
    public void setupBrw() throws InterruptedException {
        page.setupBrowser();
    }

    @Test(priority = 1)
    public void regEmail() throws InterruptedException {
        page.randomEmail();

    }
    @Test(priority = 2)
    public void Fillf(){
        page.fillForm();
    }


}
