package Star_Pattern.src.Star_Pattern;

public class Star9 {
    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {
            for (int y = 5; y > x; y--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= x; k++) {
                if (x>=2 && k>1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }


            }System.out.println();


        }
    }
}