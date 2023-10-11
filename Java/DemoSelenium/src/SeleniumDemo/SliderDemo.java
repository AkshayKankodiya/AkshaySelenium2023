package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SliderDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> d = driver.findElements(By.tagName("iframe"));
        System.out.println(d.size());
        driver.switchTo().frame(0);
        WebElement sc = driver.findElement(By.xpath("//div[@id='slider']/span"));

        Actions slider1 = new Actions(driver);
        slider1.moveToElement(sc).dragAndDropBy(sc, 200, 0).build().perform();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demo.automationtesting.in/Slider.html");
        WebElement sld1 = driver.findElement(By.xpath("//div[@id='slider']/a"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(sld1).dragAndDropBy(sld1, 150, 0).build().perform();

        action1.moveToElement(sld1).dragAndDropBy(sld1, 250, 0).build().perform();
        Thread.sleep(3000);
        action1.moveToElement(sld1).dragAndDropBy(sld1, -400, 0).build().perform();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://codepen.io/pnps/pen/LoYXZr");
        List<WebElement> frm = driver.findElements(By.tagName("iframe"));
        System.out.println(frm.size());
        driver.switchTo().frame(0);
        WebElement c1 = driver.findElement(By.xpath("(//div[@id='slider-range']/span)[1]"));
        Actions actionc = new Actions(driver);
        action1.moveToElement(c1).dragAndDropBy(c1, 300, 0).build().perform();
        WebElement c2 = driver.findElement(By.xpath("(//div[@id='slider-range']/span)[2]"));
        Actions actionc2 = new Actions(driver);

        actionc2.moveToElement(c2).dragAndDropBy(c2, 400, 0).build().perform();



    }
}
