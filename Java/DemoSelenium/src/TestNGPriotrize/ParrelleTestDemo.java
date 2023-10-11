package TestNGPriotrize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class ParrelleTestDemo {

    WebDriver driver;


    @Test
    void homeLogo() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("Setup is successfully Done logo");
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo Is not Display");

        driver.quit();
        Thread.sleep(5000);
    }

    @Test
    void homeTitle() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        System.out.println("Setup is successfully Done title");
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title is not Matche");
        Thread.sleep(5000);
        driver.quit();


    }




}
