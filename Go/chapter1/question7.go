package chapter1

func rotate(matrix [][]int, n int) {
    for i := 0; i < n / 2; i++ {
        for j := i; j < n-1-i; j++ {
            tmp := matrix[i][j];
            matrix[i][j] = matrix[n-1-j][i];
            matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
            matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
            matrix[j][n-1-i] = tmp;            
        }
    }
}