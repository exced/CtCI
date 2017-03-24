package ctcilib;

import java.util.Arrays;

public class NQueens {

    public static void solve(int n) {
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        solveBacktrack(queens, n, 0);
    }
    
    public static void printQueens(int[] queens) {
        System.out.println(Arrays.toString(queens));
        for (int row = 0; row < queens.length; row++) {
            for (int col = 0; col < queens.length; col++) {
                    System.out.print(col != queens[col] ? "*" : queens[col]);
            }
            System.out.println();
        }
    }

    private static boolean isValid(int[] queens, int n, int col, int row) {
        for (int i = 0; i < n; i++) {
            if (row != i && queens[i] == col || queens[i] == row || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    
    private static void solveBacktrack(int[] queens, int n, int row) {
        if (row == n) {
            System.out.println("solution :");
            printQueens(queens);
        } else {
            for (int col = 0; col < n; col++) {
                if (isValid(queens, n, row, col)) {
                    queens[row] = col;
                    solveBacktrack(queens, n, row+1);
                    queens[row] = -1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        solve(3);
    }
}