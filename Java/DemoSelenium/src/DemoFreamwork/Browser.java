package JAVA_Pract.DemoFreamwork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Browser {
    WebDriver driver;

    @Test
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
    }




}
