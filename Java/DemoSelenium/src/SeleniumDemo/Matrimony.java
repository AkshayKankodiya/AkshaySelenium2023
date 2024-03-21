package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lifepartner.in/");
        driver.manage().window().maximize();
        WebElement For = driver.findElement(By.id("sel3")); //Web ELEMENTS
        Select forS = new Select(For); //Select the element using creating  select class obj
        forS.selectByVisibleText("Bride"); //select by Visible text function
        WebElement Age1 = driver.findElement(By.id("sel1"));
        Select AgeM = new Select(Age1);
        AgeM.selectByVisibleText("20");
        WebElement Age2 = driver.findElement(By.id("sel2"));
        Select AgeMx = new Select(Age2);
        AgeMx.selectByVisibleText("30");
        WebElement Comu = driver.findElement(By.xpath("//select[@id='sel4']"));
        Select com = new Select(Comu);
        com.selectByVisibleText("Hindu:Gujarati");
        WebElement MarStat = driver.findElement(By.xpath("//select[@name='ms']"));
        Select stsM = new Select(MarStat);
        stsM.selectByIndex(1);
        WebElement photo = driver.findElement(By.xpath("//input[@name='ph']"));
        photo.click();
        WebElement Login = driver.findElement(By.xpath("//button[@class ='search-btn']"));
        Login.click();

        WebElement find = driver.findElement(By.xpath("//span[@class='navbar-brand logo']"));
        if (find.isDisplayed()) {
            System.out.println("Your are Login Successfully");
        } else {
            System.out.println("Your are not enter valid details");
        }


    }
}
