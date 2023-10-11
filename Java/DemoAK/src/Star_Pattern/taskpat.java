package Star_Pattern;

public class taskpat {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("    ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("   *");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("   *");
            }

            System.out.println();

        }
        for (int p = 2; p <= 5; p++) {
            for (int s = 1; s <= p; s++) {
                System.out.print("    ");
            }
            for (int a = 5; a >= p; a--) {

                    System.out.print("   *");

                }
            for (int b = 4; b >= p; b--) {

                    System.out.print("   *");
                }

            System.out.println();
        }
    }
}
