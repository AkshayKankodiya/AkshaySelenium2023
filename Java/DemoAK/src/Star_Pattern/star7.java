package Star_Pattern;

public class star7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("  ");
            }
            for (int c = 5; c >= a; c--) {
                System.out.print(" *");
            }
            for (int m = 4; m >= a; m--) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
