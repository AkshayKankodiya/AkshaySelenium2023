package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5, b = 4;
        System.out.println("AND  " + (a & b));

        //   (0 1 0 1) 5
        // & (0 1 0 0) 4
        // Ans is (0 1 0 0) 4

        System.out.println("OR  " + (a | b));
        //   (0 1 0 1) 5
        // | (0 1 0 0) 4
        // Ans is (0 1 0 1) 5


        System.out.println("XOR  " + (a ^ b));
        //   (0 1 0 1) 5
        // ^ (0 1 0 0) 4
        // Ans is (0 0 0 1) 1
        System.out.println("Compliment " + ~a);

        //   (0 1 0 1) 5
        //         + 1
        // Ans is (0 1 1 0) -6  in complement they invert the sign

    }


}

