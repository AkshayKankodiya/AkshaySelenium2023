package JAVA_Pract.TestNGPriotrize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @Test(dataProvider = "EmailDataProvider",dataProviderClass = TestNGPriotrize.DataProviderDemoDATA.class)
    public void Login(String email,String pass){
        System.out.println(email+"   "+pass);
    }

}
