package practicequestions_set_2;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationMatrix_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");//Square matrix rows = columns
        int rows = in.nextInt();

        int[][] matrix = new int[rows][rows];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] element : matrix) { //each row in 2D matrix is array in itself
            System.out.println(Arrays.toString(element));
        }
    }
}
