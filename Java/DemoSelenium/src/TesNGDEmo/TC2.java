package TesNGDEmo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TC2 {

    @AfterTest
    public void afterClass() {
        System.out.println("after Test");


    }
    @Test

    public void Test2(){
        System.out.println("this is Two");

    }

}
