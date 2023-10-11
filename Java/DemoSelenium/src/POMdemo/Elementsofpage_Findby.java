package POMdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Elementsofpage_Findby {
    WebDriver driver;

    @FindBy(how = How.ID, using = "vfb-5") // Syntext 1
    WebElement FirstName;

    @FindBy(id = "vfb-7") // Syntext 2
    WebElement LastName;

    @FindBy(id = "vfb-31-1")
    WebElement Gender;

    @FindBy(id = "vfb-13-address")
    WebElement Address;

    @FindBy(id = "vfb-13-address-2")
    WebElement Address1;

    @FindBy(id = "vfb-13-zip")
    WebElement City;

    @FindBy(id = "vfb-14")
    WebElement Email;
    @FindBy(id = "vfb-18")
    WebElement Date;

    @FindBy(id = "vfb-19")
    WebElement Mobile;

    @FindBy(id = "vfb-20-0")
    WebElement Course;

    @FindBy(id = "vfb-3")
    WebElement Very;

    @FindBy(id = "vfb-4")
    WebElement Submit;

    @FindBy(xpath = "//h2")
    WebElement t;


    Elementsofpage_Findby(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void setFirstName(String fname) {

        FirstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        LastName.sendKeys(lname);
    }

    public void setGender() {
        Gender.click();
    }

    public void setAddress(String add) {
        Address.sendKeys(add);
    }

    public void setAddress1(String add1) {
        Address1.sendKeys(add1);
    }

    public void setCity(String city) {
        City.sendKeys(city);
    }

    // public void State(String st)
// {
// driver.findElement(State).click();
// }
    public void Date(String dt) {
        Date.sendKeys(dt);
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
        Mobile.sendKeys(mo);
    }

    public void Course() {
        Course.click();
    }

    public void Very(String very) {
        Very.sendKeys(very);
    }

    public void setEmail(String mail) {
        Email.sendKeys(mail);
    }

    public void Submit() {
        Submit.click();
    }

    public void VR() {
        String t1 = (String) t.getText();
        System.out.println(t1);
        Assert.assertEquals(t1,"Dynamic Transaction Verification");
        System.out.println("Login Successfully");
        driver.quit();


    }


}




