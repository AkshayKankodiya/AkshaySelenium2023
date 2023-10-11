package ArrayDemo;

public class Arrayorder {
    public static void main(String[] args) {
        int[] A_order = {9, 5, 7, 8, 1, 6, 3, 2, 4};
        int temp;
        for (int i = 0; i < A_order.length; i++) {

            for (int j = i + 1; j < A_order.length; j++) {
                if (A_order[j] < A_order[i]) {
                    temp = A_order[i];
                    A_order[i] = A_order[j];
                    A_order[j] = temp;

                }
            }
            System.out.println(A_order[i] + " ");

        }


    }


}
