package Star_Pattern;

public class Star13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i >= 2 && j >= 2 && i <= 19 && j <= 19) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }

            }
            System.out.println();
        }

    }
}
