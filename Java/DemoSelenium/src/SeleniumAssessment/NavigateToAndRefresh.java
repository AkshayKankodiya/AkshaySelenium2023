package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class NavigateToAndRefresh extends MethodsForDriver {
     static String xpath1 ="//a[contains(text(), \"New User, REGISTER FREE!\")]";
     static String LifePartnerUrl ="https://www.lifepartner.in/";

   public static void main(String[] args) throws InterruptedException {

     NavigateToAndRefresh navigatetoandrefresh =new NavigateToAndRefresh();
     navigatetoandrefresh.openDriver();
     navigatetoandrefresh.lifePartnerURL(LifePartnerUrl);
    // navigatetoandrefresh.Explicitly_Visible(navigatetoandrefresh.findByXpathReturnWebElement(xpath1));
     navigatetoandrefresh.findByXpathReturnWebElement(xpath1).click();
     navigatetoandrefresh.backToPage();
     navigatetoandrefresh.forwordToPage();
     navigatetoandrefresh.hardRefresh();
     navigatetoandrefresh.backToPage();
     /*
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(text(), \"New User, REGISTER FREE!\")]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        System.out.println("This is after refresh");
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
        Thread.sleep(2000);
        driver.navigate().back();*/
    }
}
