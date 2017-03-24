package ctcilib;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j] <= arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    public static void main(String[] args) {
        int[] test1 = {2,1,3,5,7,3,4};
        sort(test1);
        System.out.println(Arrays.toString(test1));
    }
}