package StringBufferDemo;

public class StringBufferMethod {
    public static void main(String[] args){

        StringBuffer sb= new StringBuffer("Test-");
        StringBuffer sb1= new StringBuffer("");

        // its display capacity of string object (16) + (4) string value
        // Default capacity is 16 of string obj

        System.out.println(sb.capacity());   //   16+1 = 21 capacity

        System.out.println(sb1.capacity()); //   16 Default capacity
        sb.append("Realworld java Developer"); // append() method concat the string into current string
        System.out.println(sb.capacity());  // (oldcapcity*2)+2       =  (21*2)+2 =44

        sb.append(" StringBuffer Class Method");
        System.out.println(sb.capacity()+" >StringBuffer Capacity() "); //(oldcapcity*2)+2       =  (44*2)+2 =90
        sb1.ensureCapacity(100); // wecan set capacity using ensureCapacity( ) method
        System.out.println(sb1.capacity()+" >StringBuffer ensureCapacity() ");

        // StringBuffer Length()

        System.out.println(sb.length() +" >StringBuffer Lenght() ");
        sb.setLength(50); // using this method user can set lenght of string
        System.out.println(sb.length() +" >StringBuffer SetLenght() ");

        // Delete() method is delete string which give start and ending index. delete endindex-1
        System.out.println(sb);
        System.out.println(sb.delete(0,5) +" >StringBuffer delete() ");

        //charAT() this method print value on given index number in arguments
        System.out.println(sb);
        System.out.println(sb.charAt(6) +" >StringBuffer charAt() ");

        //deletecharAT() this method print value on given index number in argyuments

        System.out.println(sb);
        System.out.println(sb.deleteCharAt(0)+" >StringBuffer deleteCharAt() ");

        //setCharAt() this method repace value on given index number in argyuments and print

        sb.setCharAt(4,'x');
        System.out.println(sb +" >StringBuffer setCharAt()");




    }
}
