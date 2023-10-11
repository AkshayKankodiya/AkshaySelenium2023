package StringBufferDemo;

public class StringBufferMethodReverse {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer(" This Java");
        System.out.println(s1.reverse());

        //reverse( ) java method simply reverse the strings

        System.out.println(s1.capacity());
        s1.trimToSize();// trimTosize( ) method is used trim the capacity remaining space 
        System.out.println(s1.capacity());


    }
}