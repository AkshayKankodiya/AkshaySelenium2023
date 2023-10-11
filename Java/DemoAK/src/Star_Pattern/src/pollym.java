package Star_Pattern.src;

class cal {
    int a;
    int b;
    int c;
    cal(int a, int b) {
        System.out.println(a + b);
        System.out.println("Total of A and B");
    }

    cal(int a, int b, int c) {
        System.out.println(a + b + c);
        System.out.println("Total of A,B and c");
    }

    cal() {

        System.out.println("you Not enter any data");
    }

    cal(int a) {

        System.out.println(a);
        System.out.println("Enter Minimum 2 digit you enters only   "+ a);
    }
}

    public class pollym {
        public static void main(String[] args) {
            cal p = new cal(1,3);
            cal p1 = new cal(1,52,9);
            cal p3 = new cal(5);
            cal p2 = new cal();

        }
    }

