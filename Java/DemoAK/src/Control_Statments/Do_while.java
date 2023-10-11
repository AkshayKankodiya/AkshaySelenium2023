package Control_Statments;

public class Do_while {
    public static void main(String[] args) {
        int age = 1;

        do {
            System.out.println(age);
            age++;
        }

        while (age < 12);
        {

            System.out.println("This is out block from the do while loop");
        }
    }
}