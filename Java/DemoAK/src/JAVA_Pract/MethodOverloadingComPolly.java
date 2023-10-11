package JAVA_Pract;

public class MethodOverloadingComPolly {
    // Method to add two integers
        public void add(int a, int b) {             // Compile time Pollymerphis is Called Method Overloading
            int sum =a+b;                             // Same name with Diffrent argyument in same class
            System.out.println("A and B = " + sum);
        }

        // Method to add three integers
        public void add(int a, int b, int c) {
            int sum =a+b+c;
            System.out.println("A +B and c = "+ sum);
        }

        // Method to add two double values
        public void add(double a, double b) {
            double sum = a+b;
            System.out.println("Double A and B = "+ sum);

        }

    public void add(String s) {

        System.out.println("This is String Method ="+s);
    }

        public static void main(String[] args) {
            MethodOverloadingComPolly demo = new MethodOverloadingComPolly();

            // Calling the add method with two integers
            demo.add(4,5);
            demo.add(9.35,3.5D);
            demo.add(3,5,6);
            demo.add('A','A'); //A =65 Ascci value so A+A= 130
            // This char value convert Automatically in int Ascci Value and Call int mathod
            demo.add("Tester");

        }
    }


