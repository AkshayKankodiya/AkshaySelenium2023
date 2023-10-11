package StrPrac;

public class StringMethodCompareToIgnoreCase {
    public static void main(String[] args){
        String s = "Y";  //89
        String d=  "y"; //121

        System.out.println(s.compareToIgnoreCase(d));
        System.out.println(s.compareTo(d));

    }
}
