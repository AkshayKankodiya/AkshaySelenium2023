package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataFromTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_colspan2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.switchTo().frame(1);

        WebElement name1 = driver.findElement(By.xpath("//td[text()='Jill']"));
        System.out.println(name1.getText());

        List<WebElement> tableDataColum = driver.findElements(By.tagName("th"));
        System.out.println("Table Coloums");
        int count1 = 0;
        for (WebElement coulm : tableDataColum)
        {
            System.out.println("Column =" + ++count1);
            System.out.println(coulm.getText());
        }

        List<WebElement> tableDataRow = driver.findElements(By.tagName("tr"));
        System.out.println("Table Row");
        int count = 0;
        for (WebElement row : tableDataRow) {
            System.out.println("Row  =" + ++count);
            System.out.println(row.getText());
        }

        driver.quit();


    }
}
