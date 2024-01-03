package JAVA_Pract.DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserAction {
    public WebDriver driver;

    public WebDriver openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.navigate().to("https://automationexercise.com/");

        return driver;
    }
    }
//    public BrowserAction(WebDriver driver){
//        this.driver = driver;
//        //Create all webElement of this page
//        //PageFactory.initElements(driver, this);
//    }




