package JAVA_Pract;
    class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // setter methods to access and set or modify value of  private attributes
        public String setName(String name) {
            this.name= name;
            return name;
        }

        public int setAge(int age) {
            this.age=age;
            return age;
        }

        // Getter methods to access private attributes and get it value
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public class EncapsulationDemo {
        public static void main(String[] args) {
            // Create a Person object
            Person person = new Person("John Doe", 30);

            // Access the attributes using the getter methods
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println();

            // Access and set the value of attributes using the setter methods

            System.out.println("New Name Is : "+ person.setName("Gaurang"));
            System.out.println("New Age Is  : "+person.setAge(25));
            System.out.println();

            // Access the attributes using the getter methods
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());



        }
    }

