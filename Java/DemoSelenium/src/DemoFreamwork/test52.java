package JAVA_Pract.DemoFreamwork;
import JAVA_Pract.DemoFreamwork.Page;
import org.testng.annotations.Test;

public class test52 {
    Page pg = new Page();

    @Test(priority = 0)
    public void tree() {
        pg.run51();

    }

//    @Test(priority = 1)
//    public void click() {
//        pg.text();
//    }

}
