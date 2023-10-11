package TesNGDEmo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC3 {
    @Test

    public void Test3(){
        System.out.println("this is three");

    }

    @BeforeClass
    public void Test4(){
        System.out.println("this is four Before class");

    }
    @AfterClass
    public void Test5(){
        System.out.println("this is five after class");

    }

}
