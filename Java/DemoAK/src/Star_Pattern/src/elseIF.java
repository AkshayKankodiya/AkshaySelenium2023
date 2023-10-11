package Star_Pattern.src;

public class elseIF {
    public static void main(String[] args) {

        int a = 100;
        int b = 1101;
        int c = 111;
        if (a < b && b > c){
            System.out.println("B is big");
        }
        else if (a > b && a > c) {
                System.out.println("A is big");
            }
        else if (c > b && c > a) {
            System.out.println("C is big");
            }
        else if (c == b && b == a) {
            System.out.println("value is same .");
        }
        else
            {
            System.out.println(" invalid big values");
        }


    }

}