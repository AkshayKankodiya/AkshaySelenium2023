package JAVA_Pract;

class Mobile{
    String company;                                            // instance or globle variable
    String Model;
    int version =20;                                          // instance or globle variable
    static int price = 15000;                              // static Varieble
    public void photo() {
        int a =100;                                          // Local varieable
        System.out.println("Photography  ");
        System.out.println(company);
        System.out.println(version);
        System.out.println(a);
    }
    public void call() {
        System.out.println("Company is  " + company);
        System.out.println("Model is  " + Model);
        System.out.println("Price is  " + price);
        System.out.println("version is " + version );
        System.out.println("Calling");
        System.out.println("Price is  " + price);
        System.out.println("version is " + version );
    }

    public void music(){
        System.out.println("Song");
    }
}

public class Veriable {
    public static void main(String[] args) {
        Mobile vivo = new Mobile();
        vivo.company = "Vivo";
        vivo.Model = "v23";
        vivo.call();
        vivo.music();
        vivo.photo();
        System.out.println(Mobile.price);
        System.out.println(vivo.version);


        System.out.println("This is vivo object");

        Mobile oppo = new Mobile();
        oppo.company = "oppo";
        oppo.Model = "F27";
        Mobile.price = 850;
        oppo.call();
        oppo.music();
        oppo.photo();
    }

    }

