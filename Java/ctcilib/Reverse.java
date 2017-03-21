package ctcilib;

import java.util.Arrays;

public class Reverse {

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int lastIndex = arr.length - 1 - i;
            int tmp = arr[i];
            arr[i] = arr[lastIndex];
            arr[lastIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}