package JAVA_Pract;
class Car
{
    String carName ;
    int carPrice;
    public Car(String carName,int carPrice){
        this.carName=carName;
        this.carPrice=carPrice;

    }
    void display()
    {
        System.out.println("Car Name is  :"+ carName);
        System.out.println("Car Price is  :"+ carPrice);
    }

}
class Engine extends Car {
    // Car (HAS-A) Engine this is Composition Relationship and Strong Relationship between 2 class
    String engineType;
    int engineNumber;

    public Engine(String carName, int carPrice, String engineType, int engineNumber) {
        super(carName, carPrice);
        this.engineType = engineType;
        this.engineNumber = engineNumber;
    }

    void display() {
        super.display();
        System.out.println("Engine Type :" + engineType);
        System.out.println("Engine Number  :" + engineNumber);


    }
}
    class MusicSystem extends Car {
        // Car (HAS-A) Engine this is Aggregation Relationship and Weak Relationship between 2 class
        String MusicSystemCompany;

        public MusicSystem(String carName, int carPrice,String MusicSystemCompany) {
            super(carName, carPrice);
            this.MusicSystemCompany = MusicSystemCompany;

        }

        void display() {
            super.display();
            System.out.println("Music System company Type :" + MusicSystemCompany);
            System.out.println();

        }
    }


public class Aggregation {
    public static void main(String[] args) {
        Car Swift =new Car("Swift",700000);
        Swift.display();
        System.out.println();
        Engine High = new Engine("Polo",90000,"Petrol",1236565);
        High.display();
        System.out.println();
        MusicSystem Sony =new MusicSystem("AUDI Q3",4754226,"SONY HIGH");
        Sony.display();


    }

}




