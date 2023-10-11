package JAVA_Pract;


public class ReturnTypeDemo {

    // Method with void return type (no return value)
    public void sayHello() {
        System.out.println("Hello, world!");
    }


// Method with a primitive data type return type:
    public int add(int a, int b) {
        return a + b;
    }



    // Method with a reference data type return type:

    public String getName() {
        return "Test Reference return type";
    }


    //Method with an array return type:
    public char[] getArray() {
        char[] char1 = {'k', 'j', 'l', 'u', 'y'};
        return char1;
    }

    public void objMethod() {
        System.out.println("This is Object MEthod ");
    }

    // Method with an object return type:

    public ReturnTypeDemo getObject() {
        ReturnTypeDemo obj = new ReturnTypeDemo();
        obj.objMethod();
        // Do some initialization or manipulation of the object
        return obj;
    }


    public static void main(String[] args) {
        ReturnTypeDemo Type = new ReturnTypeDemo();


        Type.sayHello();
        System.out.println("This is  a primitive data type return type " + Type.add(5, 6));
        System.out.println("This is a array return type ");
        System.out.println(Type.getArray());
        System.out.println("This is Reference Type Return type " + Type.getName());
        Type.getObject();

    }

}
