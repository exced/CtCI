package ctcilib;

public class Quickselect {

    public static int partition(int[] a, int left, int right) {
        int p = a[right];
        int tmp;
        for (int i = left; i < right; i++) {
            if (a[i] < p) {
                tmp = a[left];
                a[left] = a[i];
                a[i] = tmp;
                left++;
            }
        }
        tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;
        return left;
    }

    public static int quickselect(int[] a, int left, int right, int k) {
        int p = partition(a, left, right);
        if (p == k - 1) {
            return a[p];
        } else if (p > left + k - 1) {
            quickselect(a, left, p - 1, k);
        } else {
            quickselect(a, p + 1, right, k);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 2, 3, 1, 2, 5};
        System.out.println("3th min : " + quickselect(a1, 0, a1.length-1, 3));
    }   
}