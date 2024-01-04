package JAVA_Pract.DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Action_class extends WaitActions {
    public WebDriver driver;

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

        //Dropdown Select BY visible text
    public void selectByVisibilityText(WebElement element, String value) {
        Explicitly_Clickeble(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }


    public void selectByIndex(WebElement element, int index) {
        Explicitly_Clickeble(element);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void verifyAccountCreateUrl(String value){
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, value, "Redirection to the success page failed");
        System.out.println("Assertion is done with URL");
    }
    public void verifyAccountCreateElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed(), "Account creation successful message not displayed");
        System.out.println("Assertion is done with success message and element");
    }

}