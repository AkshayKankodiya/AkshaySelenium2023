package ArrayDemo;

public class A_Matrix {
    public static void main(String[] args) {
        int[][] Ary = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < Ary.length; i++) {
            for (int j = 0; j < Ary[i].length; j++) {
                System.out.print(Ary[i][j] + "  ");
            }
            System.out.println();
        }


    }


}
