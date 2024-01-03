package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CheckLogin {


    @Test
    public void verifyLogin() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://scandiweb.com/services/magento-demo#magento-store");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement admin = driver.findElement(By.xpath("//a[text()='Admin']"));
        action.scrollToElement(admin);

        WebElement user = driver.findElement(By.xpath("//div[@class='body m-12 no-12']"));
        String user1 = user.getText();
        String username = user1.substring(12);
        System.out.println("UserName Is = " + username);

        WebElement pass = driver.findElement(By.xpath("//div[@class='body m-4']"));
        String pass1 = pass.getText();
        String password = pass1.substring(16);
        System.out.println("PassWord Is = " + password);
        Thread.sleep(3000);
        admin.click();
        ArrayList<String> NewWindow = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(NewWindow.get(1));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys(password);
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();

        Assert.assertEquals(driver.getTitle(), "Home AutomationExs_Page", "Error In Login >>>>");
        driver.quit();


    }


}
