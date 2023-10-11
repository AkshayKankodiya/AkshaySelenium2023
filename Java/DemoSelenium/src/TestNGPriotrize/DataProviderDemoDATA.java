package TestNGPriotrize;

import org.testng.annotations.DataProvider;

public class DataProviderDemoDATA {
    @DataProvider(name = "EmailDataProvider")
    public Object[][] Storeddata() {
        Object[][] data = {{"Abc@gmail.com", "123456"}, {"Xyz@gmail.com", "789456"}, {"Test@gmail.com", "147258"},{"Demo@gmail.com", "7777777"}};
        return data;
        // Runmulitple time untile All data are present and not need to create loop for it

    }

}
