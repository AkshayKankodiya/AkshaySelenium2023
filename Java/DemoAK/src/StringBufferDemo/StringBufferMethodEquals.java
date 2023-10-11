package StringBufferDemo;

public class StringBufferMethodEquals {
    public static void main(String[] args)
    {
    // String class .equals() check content of object and Stringbufferclas.equals() check reffence addres of objects

        StringBuffer s1= new StringBuffer("Test");
        StringBuffer s2= new StringBuffer("Test");
        StringBuffer s3= s2.append("java");
        System.out.println(s1.equals(s2)); // its check the reffrence of object is same or not

        System.out.println(s3.equals(s2));






    }
}
