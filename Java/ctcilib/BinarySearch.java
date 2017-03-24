package ctcilib;

import java.util.Arrays;

public class BinarySearch {

    /**
     * we assume that the array is sorted
     * @param sorted array
     * @param item to search
     * @return index of element in array
     */
    public static int binarySearch(int[] arr, int item) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (item == arr[mid]) {
                return mid;
            }
            if (item < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {0,2,3,6,8};
        System.out.println(binarySearch(arr1, 3));
        System.out.println(binarySearch(arr2, 6));
        System.out.println(binarySearch(arr2, 7));
    }
}