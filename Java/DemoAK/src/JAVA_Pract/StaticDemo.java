package JAVA_Pract;

public class StaticDemo {
    int empID;
    String empName;
    static String cmp = "QA Experts";    // Static Veriable share memory with created all object
                                        // Static is used for Memory Management
    static int contOB = 0;

    StaticDemo(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        System.out.println("You create a new Object  = " + this.empName);
        contOB++;
        System.out.println("This is Created " + contOB);
    }

    public void showEmp() {
        System.out.println("This Show Method");
        System.out.println(empID + "  " + empName + "  " + cmp);
        System.out.println();

    }

    static void display()  // Static Method is Directly using class name
    {
        System.out.println("This is Static Method We Not Need to create Object for use this method ");
        System.out.println(contOB);

    }

    public static void main(String[] args) {
        StaticDemo emp1 = new StaticDemo(101, "Jon");
        emp1.showEmp();

        StaticDemo emp2 = new StaticDemo(102, "Jake");
        emp2.showEmp();

        StaticDemo emp3 = new StaticDemo(103, "Jorden");
        emp3.showEmp();

        StaticDemo.display();// Using " .Class name we can call static () method


    }


}
