public class ThisDemo {
    String name;
    int age;
    String gender;

    // Constructor
    public ThisDemo(String name, int age, String gender) {
        this.name = name; // Using 'this' to refer to the instance variable
        this.age = age;   // Using 'this' to refer to the instance variable
        this.gender = gender; // Using 'this' to refer to the instance variable
    }

    // Method to print person details
    public void printDetails() {
        System.out.println("Name: " + this.name); // Using 'this' to refer to the instance variable
        System.out.println("Age: " + this.age);   // Using 'this' to refer to the instance variable
        System.out.println("Gender: " + this.gender); // Using 'this' to refer to the instance variable
    }

    public static void main(String[] args) {
        // Creating a Person object using the constructor
        ThisDemo person1 = new ThisDemo("Alice", 25, "Female");
        ThisDemo person2 = new ThisDemo("Bob", 30, "Male");
        ThisDemo person3 = new ThisDemo("Gaurang", 30, "Female");

        // Calling the method to print person details
        System.out.println("Person 1 Details:");
        person1.printDetails();

        System.out.println("\nPerson 2 Details:");
        person2.printDetails();

        System.out.println("\nPerson 3 Details:");
        person3.printDetails();
    }
}
