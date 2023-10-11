package Star_Pattern.src;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number ");
        int Num1=s.nextInt();
        System.out.println("Enter The 2nd Number ");
        int Num2=s.nextInt();
        System.out.println("Enter any Symbol( * + - / % )");
        String str= s.next();
        int Results;
        switch(str)
        {
            case "+":Results=Num1+Num2;
                System.out.println("The sum is "+Results);
                break;
            case "-":Results=Num1-Num2;
                System.out.println("The sub is "+Results);
                break;
            case "*":Results=Num1*Num2;
                System.out.println("The Mul is "+Results);
                break;
            case "/":Results=Num1/Num2;
                System.out.println("The Div is "+Results);
                break;
            case "%":Results=Num1%Num2;
                System.out.println("The Mod is "+Results);
                break;
            default:  System.out.println(" Invalid Inputs");
                break;
        }


    }
}
