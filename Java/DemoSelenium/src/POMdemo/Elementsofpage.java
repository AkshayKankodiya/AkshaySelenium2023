package POMdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Elementsofpage {
    WebDriver driver;

    By FirstName = By.id("vfb-5");
    By LastName = By.id("vfb-7");
    By Gender = By.id("vfb-31-1");
    By Address = By.id("vfb-13-address");
    By Address1 = By.id("vfb-13-address-2");
    By City = By.id("vfb-13-zip");
    // By State = By.id("select2-vfb-13-country-container");
    By Email = By.id("vfb-14");
    By Date = By.id("vfb-18");
    // By HH = By.id("select2-vfb-16-hour-container");
// By MM = By.id("select2-vfb-16-min-container");
    By Mobile = By.id("vfb-19");
    By Course = By.id("vfb-20-0");
    By Very = By.id("vfb-3");
    By Submit = By.id("vfb-4");


    Elementsofpage(WebDriver d) {
        driver = d;
    }

    public void setFirstName(String fname) {

        driver.findElement(FirstName).sendKeys(fname);
    }

    public void setLastName(String lname) {
        driver.findElement(LastName).sendKeys(lname);
    }

    public void setGender() {
        driver.findElement(Gender).click();
    }

    public void setAddress(String add) {
        driver.findElement(Address).sendKeys(add);
    }

    public void setAddress1(String add1) {
        driver.findElement(Address1).sendKeys(add1);
    }

    public void setCity(String city) {
        driver.findElement(City).sendKeys(city);
    }

    // public void State(String st)
// {
// driver.findElement(State).click();
// }
    public void Date(String dt) {
        driver.findElement(Date).sendKeys(dt);
    }

    // public void HH(String hh)
// {
// driver.findElement(HH).click();
// }
// public void MM(String mm)
// {
// driver.findElement(MM).click();
// }
    public void setMobile(String mo) {
        driver.findElement(Mobile).sendKeys(mo);
    }

    public void Course() {
        driver.findElement(Course).click();
    }

    public void Very(String very) {
        driver.findElement(Very).sendKeys(very);
    }

    public void setEmail(String mail) {
        driver.findElement(Email).sendKeys(mail);
    }

    public void Submit() {
        driver.findElement(Submit).click();
    }



    }

