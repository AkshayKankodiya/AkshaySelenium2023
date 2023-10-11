package TestNGPriotrize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParralelTest2 {
    WebDriver driver;


    @Test
    void Login() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Setup is successfully Done user Login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement logo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        Assert.assertTrue(logo.isDisplayed(), "Dashborard logo Is not Display");
        Thread.sleep(5000);
    }

    @Test
   public void method2() {
        System.out.println("This is 2 Method ");
    }
    @AfterMethod
    void down(){
        driver.quit();
    }

}

