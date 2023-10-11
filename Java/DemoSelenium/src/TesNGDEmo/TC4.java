package TesNGDEmo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC4 {

    @BeforeSuite
    public void beforSuit(){
        System.out.println("This is before Suit");
    }
@AfterSuite
    public void afterSuit(){
        System.out.println("This is After Suit");
    }
    @Test
    public void Test4(){
        System.out.println("This is 4 ");
    }
}
