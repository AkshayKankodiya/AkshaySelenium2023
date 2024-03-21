package JAVA_Pract.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DropDownDemo {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //to Maximize window
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //
        //1st Method
        driver.navigate().to("https://www.automationexercise.com/");
        WebElement loginbtn = driver.findElement(By.xpath("//*[@class='fa fa-lock']"));
        loginbtn.click();
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Akshay");

        //To Genrate Randome Email

        WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys("Akshay" + randomInt + "@gmail.com");
        System.out.println("Akshay" + randomInt + "@gmail.com");


        WebElement signup = driver.findElement(By.xpath("//*[text()='Signup']"));
        signup.click();



        WebElement day =driver.findElement(By.xpath("//select[@id='days']"));
        Select dr =new Select(day);
        dr.selectByVisibleText("19");

        WebElement month =driver.findElement(By.xpath("//select[@id='months']"));
        Select mr =new Select(month);
        mr.selectByVisibleText("April");

        WebElement Year =driver.findElement(By.xpath("//select[@id='years']"));
        Select yr =new Select(Year);
        yr.selectByVisibleText("1996");

        driver.quit();



    }
}