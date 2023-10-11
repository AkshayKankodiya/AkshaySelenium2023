package ArrayDemo;

public class Array2D {
    public static void main(String[] args) {


        int[][] arrayD;            // Declaration 2D Array
        arrayD = new int[2][3];    // crearation 2D Array
        arrayD[0][1] = 5;         // Initialization
        arrayD[1][1] = 7;
        arrayD[0][2] = 9;
        arrayD[1][0] = 3;
        arrayD[0][0] = 8;

        int[][] num = {{10, 20, 30}, {90, 80, 60, 150}, {5}, {252, 0}};//Declaration 2D Array ,crearation 2D Array And Initialization
        System.out.println(num[3].length);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }
        for (int k = 0; k < arrayD.length; k++) {
            for (int m = 0; m < arrayD[k].length; m++) {
                System.out.print(arrayD[k][m] + "  ");
            }
            System.out.println();
        }


    }
}