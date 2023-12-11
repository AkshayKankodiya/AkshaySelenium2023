package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MethodsForDriver {
    static WebDriver driver = new ChromeDriver();

    public void openDriver() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void lifePartnerURL(String url) {
        driver.navigate().to(url);
    }

    public WebElement findByXpathReturnWebElement(String xpath) {
        WebElement test = driver.findElement(By.xpath(xpath));
        return test;
    }

    public void findByXpath(String xpath) {
        driver.findElement(By.xpath(xpath));
    }

    public void backToPage() {
        driver.navigate().back();
    }

    public void forwordToPage() {
        driver.navigate().forward();
    }

    public void hardRefresh() {
        String currentUrl = driver.getCurrentUrl();
        driver.get(currentUrl);
    }

}