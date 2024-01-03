package JAVA_Pract.DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Action_class extends WaitActions{
    private WebDriver driver;

    public Action_class(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickElement(WebElement element) throws InterruptedException {
        Explicitly_Clickeble(element);
        Thread.sleep(3000);
        element.click();

    }

    public void inputText(WebElement element, String text) {
        Explicitly_Clickeble(element);
        element.clear();
        element.sendKeys(text);
    }
}