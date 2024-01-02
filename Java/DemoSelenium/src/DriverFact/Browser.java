package JAVA_Pract.DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Browser {
    public WebDriver driver;

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    public Browser(WebDriver driver){
//        this.driver = driver;
//        //Create all webElement of this page
//        //PageFactory.initElements(driver, this);
//    }



}
