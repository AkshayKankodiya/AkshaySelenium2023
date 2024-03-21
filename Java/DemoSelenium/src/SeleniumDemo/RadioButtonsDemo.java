package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> list1 = driver.findElements(By.xpath("//input[@name='group1']"));
        System.out.println(list1.size());
        for (WebElement e : list1) {
            System.out.println(e.getAttribute("value"));
            System.out.println(e.isSelected());
            if (e.getAttribute("value").equals("Milk")) {
                e.click();
            }
        }
        System.out.println("------------------------------------- GRP 1");
        for (WebElement e : list1) {
            System.out.println(e.getAttribute("value"));
            System.out.println(e.isSelected());
        }
        System.out.println("---------------------------GRP  2---------------------");
        List<WebElement> list2 = driver.findElements(By.xpath("//input[@name='group2']"));
        for (WebElement p : list2) {
            System.out.println(p.getAttribute("value"));
            System.out.println(p.isSelected());
            if (p.getAttribute("value").equals("Beer")) {
                p.click();
            }
        }
        System.out.println("------------------------------------- GRP 2");
        for (WebElement p : list2) {
            System.out.println(p.getAttribute("value"));
            System.out.println(p.isSelected());




        }

        driver.quit(); }
}
