package StrPrac;

public class StringMethodJoin {
    public static void main(String[] args) {


        String s1 = "RealWorld ";
        String s2 = "Java ";
        String s3 = "developers";

        System.out.println(String.join(";" ,s1,s2,s3));

        System.out.println(String.join("," ,s1,s2,s3));

        System.out.println(String.join(" " ,s1,s2,s3));

        System.out.println(String.join("/" ,s1,s2,s3));

        System.out.println(String.join("*" ,s1,s2,s3));

    }
}