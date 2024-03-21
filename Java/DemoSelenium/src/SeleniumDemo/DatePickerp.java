package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePickerp {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz']/child::div)[3]")).click();


        String Month = "April";
        String Year = "2024";
        String Date = "19";


        //WebElement txt1 =driver.findElement(By.xpath("//div[contains(text(),'April')]"));
        // System.out.println(txt1.getText());

        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")).click();
        while (true) {
            List<WebElement> monthsSelected = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
            for (WebElement p :monthsSelected) {
                String list1 = (String) p.getText();
                String arr[] = list1.split(" ");
                String mon = arr[0];
                String Yr = arr[1];
                if (Month.equals(mon) && Year.equals(Yr)) {
                    driver.findElement(By.xpath("(//div[contains(text(),'19')]/parent::div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[9]")).click();
                    break;
                } else {
                    driver.findElement(By.xpath("//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='circle' and contains(@cx,'24.5')]")).click();
                }
            }

        }
    }


}

