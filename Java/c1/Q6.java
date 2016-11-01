/*
* Given an image represented by an NxN matrix, where each pixel in the image is 4
* bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
*/

public class Q6 {

    /*
    * print the matrix
    */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    * pre : NxN matrix
    */
    public static void rotate(int[][] matrix, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("matrix1 before rotation");
        printMatrix(matrix1);
        System.out.println("matrix1 after rotation");
        rotate(matrix1, 3);
        printMatrix(matrix1);
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("matrix2 before rotation");
        printMatrix(matrix2);
        System.out.println("matrix2 after rotation");
        rotate(matrix2, 4);
        printMatrix(matrix2);        
    }
}