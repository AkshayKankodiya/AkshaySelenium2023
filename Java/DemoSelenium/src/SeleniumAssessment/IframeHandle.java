package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IframeHandle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> list2 = driver.findElements(By.tagName("frame"));

        System.out.println(list2.size());

        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("TESTING");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("QA-TEST");


        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("THIS IS 3rd FRAME ");
        driver.switchTo().frame(0);

        WebElement wb7 = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']"));
        System.out.println(wb7.getText());


    }
}