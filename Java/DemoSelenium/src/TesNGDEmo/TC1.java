package TesNGDEmo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

    @BeforeTest
    public void BefClass() {
        System.out.println("Before test");
    }
    @Test

    public void Test1(){
        System.out.println("this is one");

    }
}