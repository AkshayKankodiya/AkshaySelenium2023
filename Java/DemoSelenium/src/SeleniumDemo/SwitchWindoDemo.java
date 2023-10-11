package SeleniumDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchWindoDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //to Maximize window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // give time for elements loads
        //1st Method
        driver.navigate().to("https://www.automationexercise.com/");
        WebElement loginbtn = driver.findElement(By.xpath("//*[@class='fa fa-lock']"));
        loginbtn.click();

        driver.navigate().back(); // ToBack in browser page
        driver.navigate().forward(); // go to forward in browser page
        driver.navigate().refresh();  //  it is refresh  current page.
        driver.switchTo().newWindow(WindowType.WINDOW); // Goto Switch in new Window
        driver.get("https://www.google.com");









        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com");


        driver.switchTo(). newWindow(WindowType.TAB);// To open in new tab
        driver.get("https://in.linkedin.com/");

        driver.switchTo().newWindow(WindowType.TAB).get("https://ui.vision/demo/webtest/frames/"); //open new url in new tab

        driver.close(); // It is close current window tab
        


        driver.quit(); // It is close all tab and browser and Destroy Driver Obj and its created instance


}
}
