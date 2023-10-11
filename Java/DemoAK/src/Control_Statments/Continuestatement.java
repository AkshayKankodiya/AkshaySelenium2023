package Control_Statments;

public class Continuestatement {
    public static void main(String[] args) {
        int a = 5, b = 5, c;
        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                c = a + b;
                System.out.println("This Number is Skip  " + c);
                continue;
            }
            System.out.println(i);
        }
    }
}

