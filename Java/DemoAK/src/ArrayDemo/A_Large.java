package ArrayDemo;

public class A_Large {
    public static void main(String[] args) {


        int[] arr = new int[]{10010, 2, 7, 505650, 56, 18, 0, 5, 6, 3, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

        }
        System.out.println("Largest element present in given array: " + max);
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j])
                min = arr[j];

        }
        System.out.println("Smallest element present in given array: " + min);

    }
}

