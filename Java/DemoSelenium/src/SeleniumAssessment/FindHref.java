package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindHref {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lifepartner.in/");
        driver.manage().window().maximize();
        List<WebElement> Href = driver.findElements(By.tagName("a"));
        System.out.println(Href.size());
        for (WebElement d : Href)
        {
            System.out.println(d.getText());
            String list = (String) d.getText();
            System.out.println(d.getAttribute("href"));
        }

    }
}