package Star_Pattern.src;

class constructer  {
    String name ;
    String size;
    public void writing()
    {
        System.out.println("writing is here " +this.name);
        System.out.println("he is here " +this.size);
    }

    public void reading()
    {
        System.out.println("reading is here " +this.name);
        System.out.println("he is reading books " +this.size);
    }
        constructer(String name,String size)
    {
        this.name=name;
        this.size=size;
        System.out.println("This called by default when we creates object of this class");
        System.out.println("writing is here " +this.name);
        System.out.println("he is here " +this.size);
    }
    constructer()
    {
        System.out.println("This constructer has no argument");
    }
    constructer(constructer ref)
    {
        name=ref.name;
        size=ref.size;
        System.out.println("This is copy constructer");
    }
}

public class runconstructer {
    public static void main(String[] args) {
        constructer c1 = new constructer("Akshay", "QA");   //parameaterrize Constucter
        constructer c2 = new constructer("Gaurang", "Tester");
        constructer c8 = new constructer();                            // default constructer
        constructer c5 = new constructer(c2);                          // Copy constructer
        c5.reading();
    }


}


