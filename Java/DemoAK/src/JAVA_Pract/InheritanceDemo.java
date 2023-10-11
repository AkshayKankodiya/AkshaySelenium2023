package JAVA_Pract;

// Animal class (Superclass)
class Animal {
    String type;
    int age;

    // Constructor
    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Age: " + age + " years");
    }
}

// Dog class (Subclass)  This is Single Inheritence
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String type, int age, String breed) {
        super(type, age); // Call the constructor of the superclass (Animal)
        this.breed = breed;
        System.out.println();
    }

    // Override the makeSound method from the superclass
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Cat 2nd subclass Of Animal class and this is Create hierarchical inheritance
class Cat extends Animal {
    String breed;

    public Cat(String type, int age, String breed) {
        super(type, age);
        this.breed = breed;
        System.out.println();
    }

    // Override the makeSound method from the superclass
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Cat Mewow");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);

    }


}
// This is InternationCAt class is Extend from Cat Cat from Animal this is Multilevel Inheritence

class InternationalCat extends Cat {
    String Country;
    String breed;

    public InternationalCat(String Country, String type, int age, String breed) {
        super(type, age, breed);
        this.Country = Country;
        System.out.println("Country:  " + Country);
    }


}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal animal = new Animal("Overland Animal", 10);
        animal.displayInfo();
        animal.makeSound();
        System.out.println();

        // Create an instance of the Dog class
        Dog dog = new Dog("Army Dog", 3, "Labrador");
        dog.displayInfo();
        dog.displayBreed();
        dog.makeSound();

        Dog StreetDog = new Dog("Street Dog", 2, "Pomeranian");

        StreetDog.displayInfo();
        StreetDog.displayBreed();
        StreetDog.makeSound();


        Cat indianCat = new Cat("Indian Cat", 7, "Persian");
        indianCat.displayInfo();
        indianCat.displayBreed();
        indianCat.makeSound();

        InternationalCat cat1 = new InternationalCat("USA", "International CAt", 6, "American ShortHair");
        cat1.displayInfo();
        cat1.displayBreed();
        cat1.makeSound();
    }
}


