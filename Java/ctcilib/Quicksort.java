package ctcilib;

public class Quicksort {

    public static int partition(int[] a, int left, int right) {
        int p = a[right];
        int tmp;
        for (int j = left; j < right; j++) {
            if (a[j] < p) {
                tmp = a[j];
                a[j] = a[left];
                a[left] = tmp;
                left++;
            }
        }
        tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;
        return left;
    }

    public static void quicksort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }
        int p = partition(a, left, right);
        System.out.println("pivot : " + p);
        quicksort(a, left, p-1);
        quicksort(a, p+1, right);
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 1, 3, 6, 4, 5};
        System.out.println("quicksort on " + java.util.Arrays.toString(arr1) + " : ");
        quicksort(arr1, 0, arr1.length-1);
        System.out.println(java.util.Arrays.toString(arr1));
    }
}