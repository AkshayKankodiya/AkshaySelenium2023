package StrPrac;

public class StringMethodLength {
    public static void main(String args[]) {

        // length() Method


        String test = new String("Testing");  // to check length of object String content length
        System.out.println(test.length());  // length();
        String emailAddress = ("Test@gmail.com");
        System.out.println(emailAddress.length());

        // Check that String Is empty using Length () method


        int e = test.length();
        if (e == 0) {
            System.out.println("Please enter name :");
        } else {
            System.out.println("You enterd valid name:");
        }


    }
}