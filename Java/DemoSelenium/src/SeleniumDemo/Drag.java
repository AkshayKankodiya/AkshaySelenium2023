package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Drag {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.switchTo().frame(0);

        WebElement dragg =driver.findElement(By.xpath("//div[@id='draggable']"));
        System.out.println(dragg.getText());
        Actions action = new Actions(driver);
        action.moveToElement(dragg).dragAndDropBy(dragg,400,160).build().perform();







        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/dragabble");
        WebElement dg1 =driver.findElement(By.xpath("//div[@id='dragBox']"));
        System.out.println(dg1.getText());
        Actions action1 =new Actions(driver);
        action1.moveToElement(dg1).dragAndDropBy(dg1,150,50).build().perform();
        Thread.sleep(5000);
        action1.moveToElement(dg1).dragAndDropBy(dg1,-150,-30).build().perform();

        driver.findElement(By.xpath("//a[@id='draggableExample-tab-cursorStyle']")).click();


        WebElement drp1 =driver.findElement(By.xpath("//div[@id='cursorBottom']"));
        WebElement drp2 =driver.findElement(By.xpath("//div[@id='cursorCenter']"));
        WebElement drp3 =driver.findElement(By.xpath("//div[@id='cursorTopLeft']"));
        System.out.println(drp1.getText());
        Actions action5 =new Actions(driver);
        action5.moveToElement(drp1).dragAndDrop(drp1,drp2).build().perform();



        System.out.println(drp2.getText());
        Actions action6 =new Actions(driver);
        //action6.moveToElement(drp2).dragAndDropBy(drp2,10,0).build().perform();

        //WebElement drp3 =driver.findElement(By.xpath("//div[@id='cursorTopLeft']"));
        System.out.println(drp3.getText());
        Actions action7 =new Actions(driver);
       // action7.moveToElement(drp3).dragAndDropBy(drp3,10,-60).build().perform();
        action7.moveToElement(drp3).dragAndDrop(drp3,drp1).build().perform();
        Thread.sleep(4000);







    }
}
