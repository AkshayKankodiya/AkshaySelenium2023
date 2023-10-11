package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String ym="February' 24";
        String ym1 ="December' 23";


        driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();

        List<WebElement> month = driver.findElements(By.xpath("//div[@class='month-title']"));
        System.out.println(month.size());
        for (WebElement mg :month) {
            String mt = mg.getText();
            if (mt.equals(ym)) {
                driver.findElement(By.xpath("//td[@id='18/02/2024']")).click();
            }
        }

        driver.quit();







    }
}
