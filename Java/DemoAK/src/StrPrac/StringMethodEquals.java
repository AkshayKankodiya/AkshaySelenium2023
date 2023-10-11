package StrPrac;

public class StringMethodEquals {
    public static void main(String[] args) {

        String name = new String("Testing");
        String first_Name = ("Testing");
        String last_Name = ("Testing");
        String name1 = ("testing");
        String age = ("25");
        String gender =("");

        System.out.println("check reference address comparison " + (last_Name == first_Name)); //check reference address comparison
        System.out.println("check reference address comparison " + (name1 == first_Name));
        System.out.println("check reference address comparison " + (name == first_Name));
        System.out.println("check the content comparison of obj " + name.equals(first_Name)); // check the content comparison of obj
        System.out.println("check the content comparison of obj " + age.equals(last_Name)); // check the content comparison of obj


        // check String is empty using is equal Method

        if(gender.equals(""))
        {
            System.out.println("It is Empty");
        }
        else
        {
            System.out.println("Valid");
        }

    }

}
