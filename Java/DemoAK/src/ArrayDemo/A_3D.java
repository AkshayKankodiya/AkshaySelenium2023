package ArrayDemo;

public class A_3D {
    public static void main(String args[]) {

        int[][][] D = new int[2][3][2];
        D[0][0][0] = 10;
        D[0][0][1] = 20;
        D[0][1][0] = 30;
        D[0][1][1] = 40;
        D[0][2][0] = 50;
        D[0][2][1] = 60;
        D[1][0][0] = 70;
        D[1][0][1] = 80;
        D[1][1][0] = 90;
        D[1][1][1] = 100;
        D[1][2][0] = 110;
        D[1][2][1] = 120;

        int[][][] D_3 = {{{1, 2}, {3, 4}, {5, 6}}, {{7, 8}, {9, 8}, {10, 11}}};

        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                for (int k = 0; k < D[i][j].length; k++) {
                    System.out.println(D[i][j][k]);

                }
            }
        }

        for (int a = 0; a < D_3.length; a++) {
            for (int b = 0; b < D_3[a].length; b++) {
                for (int c = 0; c < D_3[a][b].length; c++) {
                    System.out.println(D_3[a][b][c]);

                }
            }


        }
    }
}

