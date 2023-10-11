package StrPrac;

public class StringMethodSearch {
    public static void main(String[] args) {

        String s1 = ("This is java program");
        System.out.println(s1.indexOf('i') +" this is indexOf method");

        System.out.println(s1.indexOf("gra") +" this is indexOf method");

        // give a index value of String position and we can find using String also


        //last indexof find the position of charecter from last and give the index which its find first

        System.out.println(s1.lastIndexOf('i') +" this is LastindexOf method");

        // charAT method gives the charecter as a output which user provided ites index value as a arguement

        System.out.println(s1.charAt(8) +" this is charAT method");

        // contains method gives the boolean value as a output if its find sub string in string.

        System.out.println(s1.contains("java") +" this is contains method");

        // start and ends with method gives boolean value as output and find its starts and ends with charecter

        System.out.println(s1.startsWith("Th")  +" this is startsWith method");

        System.out.println(s1.endsWith("va") +" this is endsWith method" );



    }
}
