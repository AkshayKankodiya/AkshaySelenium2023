package Operators;

public class LogicalOP {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        boolean f1 = a < 15; //False
        boolean f2 = b > 6; //True
        System.out.println(f1 && f2); //And
        System.out.println(a < b & a > b);
        System.out.println(f1 || f2); // OR
        System.out.println(!(f1 || f2)); // Not

        System.out.println(a < b & a > b);
        System.out.println(a < b && a > b);
        System.out.println(a < b | a > b);
        System.out.println(a < b || a > b);
    }
}
