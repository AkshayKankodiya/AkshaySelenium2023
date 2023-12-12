package JAVA_Pract.DemoFreamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class webElements {
    @FindBy(xpath = "//i[contains(@class,'fa-home')]") WebElement signUpbutton;
    @FindBy(xpath = "//input[@name='name']") WebElement inputTextbox;
    @FindBy(xpath = "//input[@data-qa='signup-email' and @type ='email' ]") WebElement regstrationEmail;
    @FindBy(xpath = "//button[text()='Signup' and @ type = 'submit']") WebElement registartionButton;
    @FindBy(xpath = "//input[@id='id_gender1']") WebElement radioBtnMale;
    @FindBy(xpath = "//input[@id='name']") WebElement nameTextbox;
    @FindBy(xpath = "//input[@id='password']") WebElement passWordtextbox;
    @FindBy(xpath = "//select[@name='days']") WebElement dayDropdown;
    @FindBy(xpath = "//select[@id='months']") WebElement monthDropdown;
    @FindBy(xpath = "//select[@id='years']")WebElement yearDropdown;
    @FindBy(xpath = "//input[@id='first_name']") WebElement fNameTextbox;
    @FindBy(xpath = "//input[@id='last_name']") WebElement lNameTextbox;
    @FindBy(xpath = "//input[@id='company']") WebElement compTextbox;
    @FindBy(xpath = "//input[@id='address1']") WebElement add1Textbox;
    @FindBy(xpath = "//select[@id='country']") WebElement contryDropdown;
    @FindBy(xpath = "//input[@id='state']") WebElement stateTextbox;
    @FindBy(xpath = "//input[@id='city']") WebElement cityTextbox;
    @FindBy(xpath = "//input[@id='zipcode']") WebElement zipTextbox;
    @FindBy(xpath = "//input[@id='mobile_number']") WebElement mobTextbox;
    @FindBy(xpath = "//button[text()='Create Account' and @type ='submit']") WebElement createAccBtn;







}