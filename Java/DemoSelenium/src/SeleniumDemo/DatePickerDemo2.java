package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class  DatePickerDemo2 {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String Syear = "1996";
        String Smonth = "Appril";
        String Sdate = "19";

        driver.findElement(By.xpath("//input[@id='dob']")).click();

        WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select Mt =new Select(mon);
        Mt.selectByVisibleText("Apr");

        WebElement Yer = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select Yt =new Select(Yer);
        Yt.selectByVisibleText("1996");

        List<WebElement> date5 = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        System.out.println(date5.size());



        for (WebElement k: date5){
            String dt=k.getText();

            if (dt.equals(Sdate)){
                k.click();
                break;
            }



        }

    }
}
