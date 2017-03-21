package dynamic;

public class Fibonacci {

    public static int fibonacci(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        for (int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    public static void main(String[] args) {
        System.out.println("fibonacci(" + 3 + ") = " + fibonacci(3));
        System.out.println("fibonacci(" + 4 + ") = " + fibonacci(4));
        System.out.println("fibonacci(" + 5 + ") = " + fibonacci(5));
    }
}