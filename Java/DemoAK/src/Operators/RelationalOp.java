package Operators;

public class RelationalOp {
    public static void main(String[] args){
        int a = 2 ;
        int b = 3 ;
        int c = 2 ;
        boolean r =a < b ;    //True
        boolean r1 =a > b ;   //False
        boolean r2 =a >= c ;  //True
        boolean r3 =c > b;     //False
        boolean r4 =c <= b;    //True
        boolean r5 =a >= b;     //False
        boolean r6 = a == c;    //True
        boolean r7 = a != c;     //False

        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
    }
}
