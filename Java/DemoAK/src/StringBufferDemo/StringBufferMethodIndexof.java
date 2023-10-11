package StringBufferDemo;

public class StringBufferMethodIndexof {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Java Developers");
        System.out.println(s1.indexOf("v") +"  StringBuffer indexOf() method ");
        System.out.println(s1.indexOf("lop") +"  StringBuffer indexOf() method ");

      // its give index number were the passing char or string are stored


        // its  start from last and search from last and give index number which its find first from last

        System.out.println(s1.lastIndexOf("v") +"  StringBuffer LastindexOf() method ");


    }
}
