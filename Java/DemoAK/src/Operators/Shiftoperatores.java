package Operators;

public class Shiftoperatores {
    public static void main(String[] args) {
        int i = 2 << 1;   // i is value 2 and binary of 2 is (0 0 1 0)
        System.out.println(i);         // after shift left 1 (0 1 0 0) is binary of 4
        int j = 4 >> 1;  // j is value 4 and binary of 4 is  (0 1 0 0)
        System.out.println(j);        // after shift right 1 (0 0 1 0) is binary of 2
        int l = 2 << 4; // l is value 2 and binary of 2 is  (0 0 1 0)
        System.out.println(l);        // after shift left 1 (1 0 0 0 0) is binary of 8
    }
}


