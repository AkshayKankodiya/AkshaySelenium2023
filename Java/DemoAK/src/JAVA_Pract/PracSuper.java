package JAVA_Pract;

class PracSuper
{
    int i = 10;
    String s1 ="This is Super";

}

class Prac2 extends PracSuper {
    int i = 20;
    String s1 ="This is Child";
    Prac2()
    {
        System.out.println("This is Non-Parameterised Constructer");
    }
    Prac2(int i ,String s1)
    {
        System.out.println(i +"   "+ s1);
        System.out.println(super.i+"  "+ super.s1 );
        System.out.println(this.i +"  "+ this.s1);

    }

    void show(int i ,String s1)
    {
        System.out.println(i +"   "+ s1); // that is Refer Local class Variable
        System.out.println(super.i+"  "+ super.s1 ); // that is Refer Immediat Parrent class Variable
        System.out.println(this.i +"  "+ this.s1);  // that is Refer Current class Instance  class Variable

    }


    public static void main(String[] args)
    {
        Prac2 p1 = new Prac2();
        p1.show(5,"This is Local");

        System.out.println("**** Create NEW Object ****");

        Prac2 p2 = new Prac2(88,"This Constructer ");


    }


}
