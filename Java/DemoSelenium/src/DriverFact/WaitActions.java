package JAVA_Pract.DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class WaitActions {
     private WebDriver driver;

    public WaitActions(WebDriver driver) {
        this.driver = driver;
    }

    public void Explicitly_Clickeble(WebElement element) {
        System.out.println("Waiting for clickeble Element");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
    }

    public void Explicitly_Visible(WebElement element) {
        System.out.println("Waiting for Visible Element");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }

}
