package TestNGPriotrize;

import org.testng.annotations.Test;

public class GroupBytestDemo {
    @Test(groups = {"Regression"},priority = 1)
    void testOne(){
        System.out.println("This is Test Regression 1");
    }

    @Test(groups = {"sanity"},priority = 0)
    void testTwo(){
        System.out.println("This is Test Sanity Group 1 ");
    }

    @Test(groups = {"sanity"})
    void testThree(){
        System.out.println("This is Test Sanity Group 2");
    }
    @Test(groups = {"Regression","sanity"},priority = 2)
    void testFour(){
        System.out.println("This is Test Regression 4 And Sanity ");
    }
}
