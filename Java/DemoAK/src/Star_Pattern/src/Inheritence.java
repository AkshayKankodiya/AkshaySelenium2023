package Star_Pattern.src;

class shape{
    int area = 100;
    int color = 500;
}
class circle extends shape {
    int r = 200;
    public void circ () {

        int x = area + r;
        System.out.println (x);

    }
}

class squere extends shape {
    int r = 2;
    public void squer () {

        int s = area*r;
        System.out.println (s);

    }
}
class round extends circle {
    public void rou () {
        int ro;
        ro = area + color*2;
        System.out.println (ro);

    }
}
class triangle extends squere {
    public void tri () {
        int  tr;
        tr= r+area ;
        System.out.println (tr);

    }
}


public class Inheritence {
public static void main(String[] args){
    circle c =new circle();
    c.circ();
    squere s1 = new squere();
    s1.squer();
    round r2 =new round();
    r2.rou();
    triangle t2 =new triangle();
    t2.tri();
}

}


