package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegisterDemo {
    public static void main(String[] args) throws InterruptedException {

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
        WebElement male = driver.findElement(By.xpath("//label[@class='top']"));
        male.click();

        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("123456");

        WebElement day1 = driver.findElement(By.xpath("//select[@name='days']"));
        Select day = new Select(day1);
        day.selectByVisibleText("19");

        WebElement month1 = driver.findElement(By.xpath("//select[@id='months']"));
        Select month = new Select(month1);
        month.selectByVisibleText("April");

        WebElement year1 = driver.findElement(By.xpath("//select[@id='years']"));
        Select year = new Select(year1);
        year.selectByVisibleText("1996");


        WebElement fName = driver.findElement(By.xpath("//input[@id='first_name']"));
        fName.sendKeys("BAPU");

        WebElement lName = driver.findElement(By.xpath("//input[@id='last_name']"));
        lName.sendKeys("Gaurang");

        WebElement add1 = driver.findElement(By.xpath("//input[@id='address1']"));
        add1.sendKeys("1 j Pattern ");
        Thread.sleep(5000);


        WebElement country1 = driver.findElement(By.xpath(" //select[@id='country']"));
        Select country = new Select(country1);
        country.selectByVisibleText("India");


        WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("Gujarat");
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("Vadodara");
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipcode.sendKeys("854562");

        WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile_number']"));
        mobile.sendKeys("9999854562");

        Thread.sleep(5000);

        WebElement createA = driver.findElement(By.xpath("//button[text()='Create Account']"));
        createA.click();
        System.out.println("Account is Created");
        driver.close();


    }
}