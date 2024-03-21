package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class FileUploadDemo {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/FileUpload.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //File Upload Using Sendkeys

        driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("C:\\Users\\QA-Rahul\\Desktop\\DEMO SELENIUM IDE.txt");


        //Using Robot class

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.foundit.in/");
        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
        WebElement dr = driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor jr = (JavascriptExecutor) driver; //Type Casting
        jr.executeScript("arguments[0].click();", dr); // Click Action Using Java Script

        /*create Robot class object and perform three steps
        1) Copy the file path
        2) Paste it to the file search bar
        3) Press enter key
         */
        Robot robo = new Robot();
        robo.delay(1000);

        //Copy in clipboard  (Ctrl+C)
        StringSelection ss = new StringSelection("C:\\Users\\QA-Rahul\\Desktop\\DEMO SELENIUM IDE.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        // paste  location (Ctrl+V)
        robo.keyPress(KeyEvent.VK_CONTROL);// press
        robo.keyPress(KeyEvent.VK_V);

        robo.keyRelease(KeyEvent.VK_CONTROL);//Realish
        robo.keyRelease(KeyEvent.VK_V);
        // press Enter key
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
       WebElement Done =driver.findElement(By.xpath("//input[@id='pop_upload']")) ;
       JavascriptExecutor okr = (JavascriptExecutor) driver; //Type Casting
       okr.executeScript("arguments[0].click();", Done);


    }

}
