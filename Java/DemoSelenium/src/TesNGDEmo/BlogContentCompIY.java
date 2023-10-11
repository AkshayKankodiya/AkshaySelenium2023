package TesNGDEmo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BlogContentCompIY {

    @Test(priority = 1)
    public void blog1() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/closing-the-deal-generating-content-at-the-decision-stage/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/closing-the-deal-generating-content-at-the-decision-stage/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog1 ");
        } else {
            System.out.println("Text are Not Matched blog1");
        }

        driver.quit();

    }

    @Test(priority = 2)
    public void blog2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/role-of-user-generated-content-in-consumer-decision-making/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3);

        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/role-of-user-generated-content-in-consumer-decision-making/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog2");
        } else {
            System.out.println("Text are Not Matched blog2");
        }

        driver.quit();

    }

    @Test(priority = 3)
    public void blog3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/benefit-of-ux-and-content-strategy-planning/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/benefit-of-ux-and-content-strategy-planning/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog3");
        } else {
            System.out.println("Text are Not Matched blog3");
        }
        driver.quit();

    }

    @Test(priority = 4)
    public void blog4() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/power-of-email-marketing-in-action/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/power-of-email-marketing-in-action-2/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog4");
        } else {
            System.out.println("Text are Not Matched blog4");
        }
        driver.quit();

    }

    @Test(priority = 5)
    public void blog5() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/how-hr-drive-engagement-and-better-conversion/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/how-hr-drive-engagement-and-better-conversion/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog5");
        } else {
            System.out.println("Text are Not Matched blog5");
        }
        driver.quit();

    }

    @Test(priority = 6)
    public void blog6() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/how-user-experience-help-you-win/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/how-user-experience-help-you-win-2/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog6");
        } else {
            System.out.println("Text are Not Matched blog6");
        }
        driver.quit();

    }

    @Test(priority = 7)
    public void blog7() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/tricks-to-drive-better-conversions-and-sales/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/tricks-to-drive-better-conversions-and-sales/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog7");
        } else {
            System.out.println("Text are Not Matched blog7");
        }
        driver.quit();

    }

    @Test(priority = 8)
    public void blog8() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/what-is-cms-and-how-can-it-improve-conversion/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/what-is-cms-and-how-can-it-improve-conversion/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog8");
        } else {
            System.out.println("Text are Not Matched blog8");
        }
        driver.quit();

    }

    @Test(priority = 9)
    public void blog9() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/6-quick-tips-for-branding-your-business/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/6-quick-tips-for-branding-your-business/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog9");
        } else {
            System.out.println("Text are Not Matched blog9");
        }
        driver.quit();

    }

    @Test(priority = 10)
    public void blog10() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://oldprodbkp.integrationyantra.com/en/what-is-user-experience-part-2/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement actual;
        actual = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));

        String actual1 = (String) actual.getText();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.integrationyantra.com/en/what-is-user-experience-part-2/");
        WebElement expected = driver.findElement(By.xpath("//div[@class='avia_textblock  ']"));
        String expected1 = (String) expected.getText();

        if (actual1.equalsIgnoreCase(expected1)) {
            System.out.println("Text are Matched blog10");
        } else {
            System.out.println("Text are Not Matched blog10");
        }
        driver.quit();

    }


}