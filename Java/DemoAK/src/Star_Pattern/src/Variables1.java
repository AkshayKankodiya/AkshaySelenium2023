package Star_Pattern.src;

public class Variables1 {
    int a = 2;
    static int b = 3;
    void add(){
        int c = a+b;
        System.out.println(c);
    }
    void mul()
    {
        int m= a*b;
        System.out.println(m);
    }
    public static void main(String args[]){
        Variables1 ob =new Variables1();
                ob.add();
        ob.a=10;
        ob.b=20;
        ob.add();
        ob.mul();
        Variables1 ob2 = new Variables1();
                ob2.add();
                ob2.mul();
                ob2.b=65;
        ob2.add();
    }

}
