package practicequestions_set_1;

import java.util.Scanner;

public class SqaureMatrix_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of matrix -> ");
        int size = in.nextInt();

        int print = 1;

        System.out.println("The matrix is -> ");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(print + " ");
                print++;
            }
            System.out.println();
        }
    }
}
