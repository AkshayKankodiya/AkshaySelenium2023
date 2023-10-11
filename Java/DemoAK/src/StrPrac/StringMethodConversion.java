package StrPrac;

public class StringMethodConversion {
    public static void main(String[] args) {

        String s1 = " This is Java";

        //type conversion of string Toupercase to Tolower and lower to upercase.

        System.out.println(s1.toUpperCase() + "  this is toUppercase Method");

        System.out.println(s1.toLowerCase() + "  this is toLowercase Method");

        //type conversion also covert diffrent type using String.valueOf()  method
        // here int and char type convert into string type


        int age =10;
        char spCh ='#';
        String s2 =String.valueOf(age);
        System.out.println(s2);

        // here we are convert String into charArray type.

        char [] c =s1.toCharArray();
        for(int i= 0; i<c.length;i++)
        {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}
