package StringBufferDemo;

public class StringBufferMethodInsert {

    public static void main(String[] args){

        StringBuffer s1 = new StringBuffer("This is java");
        System.out.println(s1);
        System.out.println(s1.insert(12," Developers"));
        System.out.println(s1.insert(7," Real World")  +"  This is StringBuffer insert() method");

        // This is insert() method to use insert string in perticuler exsting String index number

        // This is replace() method to use replace the string to the given index number

        System.out.println(s1.replace(19,23,"Python") +"  This is StringBuffer replace() method");







    }
}

