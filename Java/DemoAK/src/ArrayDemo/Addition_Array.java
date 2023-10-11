package ArrayDemo;

public class Addition_Array {
    public static void main(String[] args) {

        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num1 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] Total = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Total[i][j] = num1[i][j] + num[i][j];
                System.out.print(Total[i][j] + "  ");

            }
            System.out.println();
        }


    }
}
