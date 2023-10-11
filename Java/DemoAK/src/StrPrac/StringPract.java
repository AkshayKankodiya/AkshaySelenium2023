package StrPrac;

public class StringPract {
    public static void main(String args[]){

        String test = new String("Testing");
        System.out.println(test.length()); // to check length of object String content length
        String testNew = ("Quality_Assurance");
        System.out.println(testNew.length());
        String testOld = new String();
        System.out.println(testOld.length());

        char[] c ={'T','E','S','T'};
        String s = new String(c);  // passing char array as a reference in String object
        System.out.println(s);
        System.out.print(c[0]);
        System.out.print(c[1]);
        System.out.print(c[2]);
        System.out.println(c[3]);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }


    }
}
