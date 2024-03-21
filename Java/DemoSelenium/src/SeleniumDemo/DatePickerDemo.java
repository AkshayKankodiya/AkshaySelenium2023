package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePickerDemo {
    public static void main(String[] args) throws InterruptedException {

        String Syear = "2023";
        String Smonth = "October";
        String Sdate = "11";

        String tyear = "2023";
        String tmonth = "October";
        String tdate = "12";



        WebDriver driver = new ChromeDriver();
        driver.get("https://gsrtc.in/site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='matchStartPlaceA']")).sendKeys("VADODARA CENTRAL BUS STAND");
        driver.findElement(By.xpath("//input[@id='matchEndPlaceA']")).sendKeys("AHMEDABAD ADALAJ X");


        driver.findElement(By.xpath("//input[@id='datepickerOA']")).click();
        Thread.sleep(3000);

        while (true) {
            String MoYe = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            System.out.println(MoYe);
            String YoYe = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            System.out.println(YoYe);


            if (MoYe.equalsIgnoreCase(Smonth) && YoYe.equals(Syear)) {
                break;
            }

            driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
            Thread.sleep(3000);
        }

        List<WebElement> dtae1 = driver.findElements(By.xpath("//td/a"));
        System.out.println(dtae1.size());
        Thread.sleep(3000);


        for (WebElement ele : dtae1) {
            String fd1 = (String) ele.getText();
            if (fd1.equals(Sdate)) {
                ele.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='datepickerRA']")).click();
        Thread.sleep(3000);

        while (true) {
            String soYe = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            System.out.println(soYe);
            String xoYe = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            System.out.println(xoYe);


            if (soYe.equalsIgnoreCase(tmonth) && xoYe.equals(tyear)) {
                break;
            }

            driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
            Thread.sleep(3000);
        }

        List<WebElement> date2 = driver.findElements(By.xpath("//td/a"));
        System.out.println(date2.size());
        Thread.sleep(3000);


        for (WebElement ele2 : date2) {
            String fd2 = (String) ele2.getText();
            if (fd2.equals(tdate)) {
                ele2.click();
                break;
            }
        }


        WebElement ps = driver.findElement(By.xpath("//select[@id='selectNoOfPassengersO']"));
        Select rd =new Select(ps);
        rd.selectByVisibleText("3");

        driver.findElement(By.xpath("(//button[text()='Search'])[1]")).click();




    }
}
