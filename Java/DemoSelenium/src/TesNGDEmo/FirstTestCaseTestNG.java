package TesNGDEmo;

import org.testng.annotations.Test;

public class FirstTestCaseTestNG {

        @Test
        void setup () {
            System.out.println("this setup");
        }
        @Test
        void testSetup () {
            System.out.println("i am in");
        }
        @Test
        void testDown () {
            System.out.println("This is Down");

        }

    }
