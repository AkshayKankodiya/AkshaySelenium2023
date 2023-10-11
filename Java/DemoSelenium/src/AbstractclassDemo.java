package JAVA_Pract;

abstract class Vehicle {
    String name;
    int maxSpeed;
    int rpm;


    public Vehicle(String name, int maxSpeed) {

        this.name = name;
        this.maxSpeed = maxSpeed;
    }


    abstract void display(); //This is Abstract Method

    abstract void rpmOfVehicle(int rpm); // This is abstract Method

}

class Car1 extends Vehicle {
    String model;
    String colore;
    int price;
    int rpm;

    public Car1(String name, int maxSpeed, String model, String colore, int price) {
        super(name, maxSpeed);
        this.model = model;
        this.colore = colore;
        this.price = price;


    }

    @Override
    void rpmOfVehicle(int rpm) {
        this.rpm = rpm;
        System.out.println("CAR RPM IS   :" + rpm);
        System.out.println();
    }

    @Override
    void display() {
        System.out.println("Name is  :" + name);
        System.out.println("Car Max Speed is   :" + maxSpeed);
        System.out.println("Car model is   :" + model);
        System.out.println("Car colore is   :" + colore);
        System.out.println("Car Price is   :" + price);
        System.out.println();
    }
}

class Bike extends Vehicle {
    String model;
    String colore;
    int price;
    int rpm;

    public Bike(String name, int maxSpeed, String model, String colore, int price) {
        super(name, maxSpeed);
        this.model = model;
        this.colore = colore;
        this.price = price;
    }

    @Override
    void rpmOfVehicle(int rpm) {
        this.rpm = rpm;
        System.out.println("Bike RPM IS   :" + rpm);
        System.out.println();
    }

    @Override
    void display() {
        System.out.println("Bike Name is  :" + name);
        System.out.println("Bike Max Speed is   :" + maxSpeed);
        System.out.println("Bike model is   :" + model);
        System.out.println("Bike colore is   :" + colore);
        System.out.println("Bike Price is   :" + price);
        System.out.println();

    }
}

public class AbstractclassDemo {
    public static void main(String[] args) {

        Car1 ALTO = new Car1("ALTO", 130, "LXI", "Yellow", 30000);
        ALTO.display();
        ALTO.rpmOfVehicle(800);
        System.out.println();
        Bike Royal =new Bike("Royal enfield Clasic",200,"350 CC","Red and Black",350000);
        Royal.display();
        Royal.rpmOfVehicle(500);
         }
    }




