package JAVA_Pract;

import java.util.Scanner;
class Scanner1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name =s.next();
        System.out.println("Enter Your Age");
        int age =s .nextInt();
        System.out.println("Enter Your Gender");
        char Gender =s.next().charAt(0);
        System.out.println("Enter Your Mobile");
        Long Mob =s .nextLong();
    }
}