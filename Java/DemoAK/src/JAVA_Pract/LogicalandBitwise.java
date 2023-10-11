package JAVA_Pract;

public class LogicalandBitwise {

    public static void main(String[] args) {
        // Logical Operators
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean result1 = a && b;
        System.out.println("Logical AND: " + result1); // Output: false

        // Logical OR
        boolean result2 = a || b;
        System.out.println("Logical OR: " + result2); // Output: true

        // Logical NOT
        boolean result3 = !a;
        System.out.println("Logical NOT: " + result3); // Output: false

        // Bitwise Operators
        int x = 5;  // Binary: 0101
        int y = 3;  // Binary: 0011

        // Bitwise AND
        int result4 = x & y;
        System.out.println("Bitwise AND: " + result4); // Output: 1 (Binary: 0001)

        // Bitwise OR
        int result5 = x | y;
        System.out.println("Bitwise OR: " + result5); // Output: 7 (Binary: 0111)

        // Bitwise XOR
        int result6 = x ^ y;
        System.out.println("Bitwise XOR: " + result6); // Output: 6 (Binary: 0110)

        // Bitwise NOT
        int result7 = ~x;
        System.out.println("Bitwise Complement: " + result7); // Output: -6
    }
}

