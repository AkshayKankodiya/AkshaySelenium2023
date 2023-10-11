package TestNGPriotrize;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepandancyDemo {
    @Test
    void empPresent() {
        Assert.fail();
        System.out.println("Employee is Present Today ");

    }

    @Test(dependsOnMethods = {"empPresent"})
    void startWork() {
        System.out.println("Employee is Start Work");
    }

    @Test(dependsOnMethods = {"startWork"})
    void takeBreck() {
        System.out.println("Employee is  Take a Breck ");
    }
    // Always-run methods are always run even the dependency methods fail.
    @Test(dependsOnMethods = {"startWork", "takeBreck"},alwaysRun = true)

    void workDone() {

        System.out.println("Employee is  Complete work ");
    }

}
