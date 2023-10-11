package StrPrac;

public class StringClassMethodReplace {

    public static void main(String[] args){

        String s1 =" This is Java, " +
                "This is java Demo" +
                "This is String Method" +
                "This is Replace method";
        System.out.println(s1.replace("is","was"));

        //Replae first

        System.out.println(s1.replaceFirst("is","was"));

        //Replae All we can provide (RegEX) reguler expression

        System.out.println(s1.replaceAll("is(.)","was"));

        //(.*) is regex if it is find is then replace further string by was
        System.out.println(s1.replaceAll("is(.*)","was"));


    }
}
