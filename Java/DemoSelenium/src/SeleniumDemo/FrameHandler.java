package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FrameHandler {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       List<WebElement> list1= driver.findElements(By.tagName("iframe"));

        System.out.println(list1.size());
        driver.switchTo().frame(0);
        WebElement wb = driver.findElement(By.xpath("//div[@id='draggable']"));
        System.out.println(wb.getText());

        driver.switchTo().defaultContent();
        WebElement txt = driver.findElement(By.xpath("//h3[text()='Widgets']"));
        System.out.println(txt.getText());

        driver.switchTo().newWindow(WindowType.TAB).get("https://ui.vision/demo/webtest/frames/"); //open new url in new tab

        List<WebElement> list2 =driver.findElements(By.tagName("frame"));
        System.out.println(list2.size());

        driver.switchTo().frame(2);
        WebElement wb1 = driver.findElement(By.xpath("//input[@name='mytext3']"));
        wb1.sendKeys("Demo");
        WebElement wb2 = driver.findElement(By.xpath("//center/p"));
        System.out.println(wb2.getText());
        driver.switchTo().defaultContent();


        driver.switchTo().frame(1);
        WebElement wb5 =driver.findElement(By.xpath("//div[@align='center']/input[@name='mytext2']"));
        wb5.sendKeys("Frame212");

        WebElement wb6 =driver.findElement(By.xpath("//div[@align='center']/child::input[@name='mytext2']/parent::div"));

        System.out.println(wb6.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.switchTo().frame(0);
        WebElement wb7=driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']"));
        System.out.println(wb7.getText());


        List <WebElement> op =driver.findElements(By.xpath("//label[@class='docssharedWizToggleLabeledContainer ajBQVb']"));
        System.out.println(op.size());
        for (WebElement j: op)
        {
            System.out.println(j.getText());

            System.out.println(j.isSelected());
        }
        WebElement wb8= driver.findElement(By.xpath("//div[@id='i5']/parent::div/parent::div"));
        wb8.click();
        System.out.println(wb8.getText());
        for (WebElement j: op)
        {
            System.out.println(j.getText());

            System.out.println(j.isSelected());
        }











    }
}
