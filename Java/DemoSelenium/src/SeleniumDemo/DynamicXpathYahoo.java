package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicXpathYahoo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://in.search.yahoo.com/;_ylt=Awr1TgVWK9JkxV0MjoW6HAx.");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//input[@name='p']"));
        search.sendKeys("Selenium");
        Thread.sleep(3000);

        //Dynamic Xpath (Start-with)
        List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(text(),'selenium')]"));



        System.out.println("Elenmets are find  :" + list.size());
        list.get(1).click();
        Thread.sleep(5000);
        driver.navigate().back();
        WebElement search2 = driver.findElement(By.xpath("//input[@id='yschsp']"));
        search2.sendKeys("java");
        Thread.sleep(5000);
        List<WebElement> list1 = driver.findElements(By.xpath("//*[contains(text(),'java')]"));
        System.out.println("Elenmets are find  :" + list1.size());
        list1.get(12).click();

        Thread.sleep(3000);


        driver.quit();


    }
}
