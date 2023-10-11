package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagWithSpesificClassName {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webpagetest.org/video/");
        driver.manage().window().maximize();
        List<WebElement> cls = driver.findElements(By.tagName("h1"));
        System.out.println(cls.size());
        for (WebElement d : cls)
        {
            System.out.println(d.getText());
            String list = (String) d.getText();
            System.out.println(d.getAttribute("class"));
        }

    }
}
