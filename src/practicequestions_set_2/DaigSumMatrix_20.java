package practicequestions_set_2;

public class DaigSumMatrix_20 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int diagSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagSum += matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum is -> " + diagSum);
    }
}
