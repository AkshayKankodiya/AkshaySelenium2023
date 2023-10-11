package JAVA_Pract;

class Vehicl {
    String typeOfVehicle;
    int mYear;
    int maxSpeed;
    //Run time Polymorphism is achive by Method Overriding
    //Method Overriding is same method with same Arguments with diffrent class
    // Class Must have(IS-A) Inharitance Relationship;
    

    public Vehicl(String typeOfVehicle, int mYear, int maxSpeed) {
        this.typeOfVehicle = typeOfVehicle;
        this.mYear = mYear;
        this.maxSpeed = maxSpeed;
    }

    public Vehicl() {
        System.out.println("This is Vehicle NON ");
        System.out.println();
    }

    void display() {
        System.out.println("This is  " + typeOfVehicle);
        System.out.println("Manufacturing Year is " + mYear);
        System.out.println("Maximum speed is " + maxSpeed);
        System.out.println();
    }
}
class i20 extends Vehicl {
    String model;

    public i20(String typeOfVehicle, int mYear, int maxSpeed, String model) {
        super(typeOfVehicle, mYear, maxSpeed);
        this.model = model;
    }

    void dispaly() {

        System.out.println("This Car model is " + model);
        System.out.println("This is Car Method ");
        super.display();
    }
}

class Classic350 extends Vehicl {
    String model;

    public Classic350(String typeOfVehicle, int mYear, int maxSpeed, String model) {
        super(typeOfVehicle, mYear, maxSpeed);
        this.model = model;
    }

    void dispaly() {
        System.out.println("This Bike model is " + model);
        System.out.println("This is Bike Method ");
        super.display();
    }
}

public class MethodOverridingRuntPolly
{

    public static void main(String[] args) {

        i20 sp = new i20("4 wheels", 2020, 120, "sport");
        sp.dispaly();

        System.out.println();

        Classic350 Bullet = new Classic350("2 Wheeler", 2022, 120, "Classic 350 Bullet");
        Bullet.dispaly();

        Vehicl v = new Vehicl();
        v.display();

    }

}
