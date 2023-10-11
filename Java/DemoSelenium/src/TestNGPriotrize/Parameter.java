package TestNGPriotrize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Parameter {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})

    void setup(String browser,String app) throws InterruptedException {
        if(browser.equalsIgnoreCase("chrome"))
        {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Setup is successfully Done Crome");
        Thread.sleep(3000);
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("Setup is successfully Done firefox");


        }
        driver.get(app);
            
        }

        @Test(priority = 1)
    void homeLogo() throws InterruptedException {
        Thread.sleep(5000);

        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo Is not Display");
    }

    @Test(priority = 2)
    void homeTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title is not Matche");
    }

    @AfterClass
    void afterclass() {
        driver.quit();
    }

}
