package JAVA_Pract.DemoFreamwork;

import JAVA_Pract.DriverFact.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Random;

//import static JAVA_Pract.SeleniumAssessment.MethodsForDriver.driver;

//import static JAVA_Pract.SeleniumAssessment.MethodsForDriver.driver;


public class Automation_Page extends ElementsActions  {

    // Create a BrowserAction object with an existing WebDriver instance
    private WebDriver driver;
    private BrowserAction browser;
    private ElementsActions elementsActions ;
    private WaitActions waitActions;
    private Action_class actionClass;


    public Automation_Page(WebDriver driver){
        super(driver);
        this.driver=driver;
       this.browser  = new BrowserAction();
       this.elementsActions = new ElementsActions(driver);
       this.waitActions =new WaitActions(driver);
       this.actionClass =new Action_class(driver);
    }

   // Setup Browser
    public void setupBrowserpage () throws InterruptedException {
        driver.get(ConstantData.BASE_URL);
       // actionClass.clickElement(signUpbutton);
    }
    // Go to Registration page
    public void randomEmailPage () throws InterruptedException {

        actionClass.inputText(inputTextbox,ConstantData.USERNAME);

        //To Genrate Randome Email

        actionClass.clickElement(regstrationEmail);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        regstrationEmail.sendKeys("Akshay" + randomInt + "@gmail.com");
        System.out.println("Akshay" + randomInt + "@gmail.com");
        actionClass.clickElement(registartionButton);

    }
    // fill the Registration page

    public void fillFormPage() throws InterruptedException {
        actionClass.clickElement(radioBtnMale);
        actionClass.inputText(passWordtextbox,ConstantData.PASSWORD);
        actionClass.selectByVisibilityText(dayDropdown,ConstantData.DAY);
        actionClass.selectByIndex(monthDropdown,ConstantData.MONTH);
        actionClass.selectByVisibilityText(yearDropdown,ConstantData.YEAR);
        actionClass.inputText(fNameTextbox,ConstantData.FIRSTNAME);
        actionClass.inputText(lNameTextbox,ConstantData.LASTTNAME);
        actionClass.inputText(compTextbox,ConstantData.COMPANY);
        actionClass.inputText(add1Textbox,ConstantData.ADDRESS1);
        actionClass.inputText(add2Textbox,ConstantData.ADDRESS2);
        actionClass.selectByVisibilityText(contryDropdown,ConstantData.COUNTRY);
        actionClass.inputText(stateTextbox,ConstantData.STATE);
        actionClass.inputText(cityTextbox,ConstantData.CITY);
        actionClass.inputText(zipTextbox,ConstantData.ZIPCODE);
        actionClass.inputText(mobTextbox,ConstantData.MOBILE);
        actionClass.clickElement(createAccBtn);
        System.out.println("Account is created Succsessfully");
        actionClass.verifyAccountCreateUrl(ConstantData.ExpectedSuccessPageURL);
        actionClass.verifyAccountCreateElement(SuccessMessage);

    }






}
