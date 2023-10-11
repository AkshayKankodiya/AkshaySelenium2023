package JAVA_Pract.SeleniumAssessment;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChangeCurrency {
    WebDriver driver = new ChromeDriver();
    String test;
    String test1;

    @Test
    public void Test() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://scandiweb.com/services/magento-demo#magento-store");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Actions action = new Actions(driver);
        WebElement frontEnd = driver.findElement(By.xpath("//a[text()='Front-end']"));
        action.scrollToElement(frontEnd);
        frontEnd.click();
        ArrayList<String> NewWindow = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(NewWindow.get(1));
        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Training");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        List<WebElement> doller = driver.findElements(By.xpath("//span[@class='price']"));
        int counter1 =0;
        for (WebElement d : doller) {
            //System.out.println(d.getText());
            test = (String) d.getText().substring(0, 1);
            System.out.println(   ++counter1+ ".Product Price in "+test);

        }
      driver.findElement(By.xpath("//div[@id='switcher-currency-trigger']")).click();
        WebElement uroCurrency = driver.findElement(By.xpath("(//a[text()='EUR - Euro'])[1]"));
       uroCurrency.click();
        List<WebElement> euro = driver.findElements(By.xpath("//span[@class='price']"));
        int counter =0;
        for (WebElement p : euro) {
            //System.out.println(d.getText());
            test1 = (String) p.getText().substring(0, 1);
            System.out.println(   ++counter+ ".Product Price in "+test1);

        }

       // Assert.assertNotEquals(test,test1,"Currency not changed ");
        SoftAssert verify = new SoftAssert();
       verify.assertNotEquals(test,test1,"Currency not changed");

        // Verify that the actual value is equal to the expected value
        System.out.println("After SoftAssert");
        verify.assertAll();
        driver.quit();





    }
}
