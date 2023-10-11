package StrPrac;

public class StringMethodTrim {
    public static void main(String[] args) {

        // trim() Method
        String fullName = ("    Tester    ");
        System.out.println(fullName);
        System.out.println(fullName.trim());


        String sub =("       ");
        System.out.println(sub.length()); // count Empty space into length of string
        System.out.println(sub.trim().length()); // First Trim the space and count the string
        boolean c =sub.trim().isEmpty();
        if (c==true)
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("Valid");
        }

    }
}
