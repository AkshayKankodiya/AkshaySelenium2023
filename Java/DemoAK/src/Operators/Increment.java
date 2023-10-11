package Operators;

public class Increment {
    public static void main(String[] args){
        int i = 5;
        int n = 6;
        System.out.println(i++); // 6
        System.out.println(--n);// 5
        System.out.println(i++);//7
        System.out.println(n++ + --i); //11

    }
}
