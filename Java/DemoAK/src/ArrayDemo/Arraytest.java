package ArrayDemo;

public class Arraytest {
    public static void main(String[] args) {

        int[] Arrayint;              //declaration
        Arrayint = new int[3];      // creatation
        Arrayint[0] = 56;          //initialiazation
        Arrayint[1] = 54;
        Arrayint[2] = 24;


        char[] ArrayChar = new char[5];   // Declaration and creation
        ArrayChar[0] = 'A';              //initialiazation
        ArrayChar[1] = 'R';
        ArrayChar[2] = 'R';
        ArrayChar[3] = 'A';
        ArrayChar[4] = 'Y';

        int[] num = {10, 52, 25, 33};      // Declaration , creation  //initialiazation

        System.out.println(num);

        System.out.println(ArrayChar);


        for (int i = 0; i < ArrayChar.length; i++) {    // for loop
            System.out.println(ArrayChar[i]);
        }


        for (int i : Arrayint) {                        // For each loop
            System.out.println(i);
        }

        for (int i = 0; i < num.length; i++) {          // for loop
            System.out.println(num[i]);
        }


    }
}

