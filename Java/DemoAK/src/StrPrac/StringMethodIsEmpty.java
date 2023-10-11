package StrPrac;

public class StringMethodIsEmpty {
    public static void main(String[] args) {

        //isEmpty() Method

        String newname = ("Test");
        System.out.println(newname.isEmpty());

        boolean b = newname.isEmpty();


        if (b == true) {
            System.out.println("New Name is Empty");
        } else {
            System.out.println("Your entered valid name  " +newname);
        }


    }
}
