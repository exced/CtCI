package c1;
/*
* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
*/
import ctcilib.Matrix;

class Position {
    private int x;
    private int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){ return this.x; }
    public int getY(){ return this.y; }
}

public class Q7 {  

    /*
    * keep track of the zeros
    */
    public static void setZeros(int[][] matrix, int m, int n) {
        java.util.ArrayList<Position> zeroPos = new java.util.ArrayList<Position>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    zeroPos.add(new Position(i,j));
            }
        }
        for (Position pos : zeroPos) {
            for (int j = 0; j < n; j++) {
                matrix[pos.getX()][j] = 0;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][pos.getY()] = 0;
            }            
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2},{0,3},{4,5}};
        System.out.println("matrix1 before setting zeros");
        Matrix.printMatrix(matrix1);
        System.out.println("matrix1 after setting zeros");
        setZeros(matrix1, 3, 2);
        Matrix.printMatrix(matrix1);
    }
}