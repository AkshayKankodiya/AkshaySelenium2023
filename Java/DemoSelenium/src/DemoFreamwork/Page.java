package JAVA_Pract.DemoFreamwork;

import JAVA_Pract.DriverFact.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import JAVA_Pract.DriverFact.webElements;

//import static JAVA_Pract.SeleniumAssessment.MethodsForDriver.driver;

//import static JAVA_Pract.SeleniumAssessment.MethodsForDriver.driver;


public class Page {

    // Create a Browser object with an existing WebDriver instance
    Browser browser = new Browser();
    webElements wb = new webElements();

    public void run51 (){
        browser.openBrowser();
        wb.signUpbutton.click();
    }





}
