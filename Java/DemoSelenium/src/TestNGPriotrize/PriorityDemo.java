package TestNGPriotrize;

import org.testng.annotations.Test;

public class PriorityDemo {
    @Test(priority = 3)
    void testOne(){
        System.out.println("This is Test 1");
    }

    @Test(priority = 2)
    void testTwo(){
        System.out.println("This is Test 2");
    }

    @Test(priority = 1, enabled = false) //Priority and disability of methods
    void testThree(){
        System.out.println("This is Test 3");
    }
    @Test(priority = 0)
    void testFour(){
        System.out.println("This is Test 4");
    }





}
