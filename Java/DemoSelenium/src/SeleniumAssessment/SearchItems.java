package JAVA_Pract.SeleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchItems {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 0)
    public void search() {
        driver.manage().window().maximize();
        driver.navigate().to("https://scandiweb.com/services/magento-demo#magento-store");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement frontEnd = driver.findElement(By.xpath("//a[text()='Front-end']"));
        action.scrollToElement(frontEnd);
        frontEnd.click();
        ArrayList<String> NewWindow = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(NewWindow.get(1));
        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Training");
        search.sendKeys(Keys.ENTER);

    }

    @Test(priority = 1)
    public void testResult() {
        WebElement Countofitem = driver.findElement(By.xpath("//p[@id='toolbar-amount']"));
        String count = Countofitem.getText();
        System.out.println(count);
        Pattern pattern = Pattern.compile("(?<=-)(\\w{2})");

        Matcher matcher = pattern.matcher(count);

        if (matcher.find()) {
            String pageItemCount = matcher.group();
            System.out.println(pageItemCount);


            //String pageItemCount = count.substring(8, 10);

            List<WebElement> serchItem1 = driver.findElements(By.xpath("//div[@class='product-item-info']"));
            int compare = serchItem1.size();
            System.out.println("Compare =" + compare);
            String itemOnPage = String.valueOf(compare);
            System.out.println("itemOnPage =" + itemOnPage);
            Assert.assertEquals(itemOnPage, pageItemCount, "Item Count is Not match on page 1");
            WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
            next.click();

            WebElement Countofitem2 = driver.findElement(By.xpath("//p[@id='toolbar-amount']"));
            String count2 = Countofitem2.getText();
            System.out.println(count2);
            Pattern pattern2 = Pattern.compile("(?<=-)(\\w{2})");

            Matcher matcher2 = pattern2.matcher(count2);

            if (matcher2.find()) {
                String pageItemCount2 = matcher2.group();
                System.out.println(pageItemCount2);

                //String pageItemCount2 = count2.substring(9, 11);
                System.out.println(pageItemCount2);
                List<WebElement> serchItem2 = driver.findElements(By.xpath("//div[@class='product-item-info']"));
                int compare2 = serchItem2.size() + compare;
                String itemOnPage2 = String.valueOf(compare2);
                System.out.println("pagecount on 2 =" + pageItemCount2);
                System.out.println("itemOnPage2 =" + itemOnPage2);
                Assert.assertEquals(pageItemCount2, itemOnPage2, "Item Count Not are matched");
                driver.quit();

            }

        }
    }
}



