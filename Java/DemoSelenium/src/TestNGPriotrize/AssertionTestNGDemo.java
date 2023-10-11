package TestNGPriotrize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionTestNGDemo {
    WebDriver driver;

    @BeforeClass
    void setup ()  {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.out.println("Setup is successfully Done");
    }
    @Test(priority = 1)
    void homeLogo () throws InterruptedException {
        Thread.sleep(5000);

        WebElement logo =driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(),"Logo Is not Display");
    }
    @Test(priority = 2)
    void homeTitle () {
      String title=driver.getTitle();
      Assert.assertEquals(title,"OrangeHRM","Title is not Matche");
    }
    @AfterClass
    void afterclass(){
        driver.quit();
    }

}
