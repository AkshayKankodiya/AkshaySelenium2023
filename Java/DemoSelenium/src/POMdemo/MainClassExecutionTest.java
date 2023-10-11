package POMdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainClassExecutionTest {
    @Test
    public void exicuteTest() {
        WebDriver driver = new ChromeDriver();
        //Elementsofpage ELM = new Elementsofpage(driver);
        Elementsofpage_Findby ELM = new Elementsofpage_Findby(driver);
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ELM.setFirstName("Akshay Kumar");
        ELM.setLastName("Kankodiya");
        ELM.setGender();
        ELM.setAddress("Prayagraj Soc");
        ELM.setAddress1("Waghodia road");
        ELM.setCity("Vadodara");
        ELM.setEmail("Akshay@gmail.com");
        ELM.setMobile("88887777888");
        ELM.Date("12/04/2022");
        ELM.Course();
        ELM.Very("99");
        ELM.Submit();
        ELM.VR();


    }
}
