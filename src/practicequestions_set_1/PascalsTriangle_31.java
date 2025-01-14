package practicequestions_set_1;

import java.util.Scanner;

public class PascalsTriangle_31 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; i <= rows; j++) {
                if (j == 1) {
                    System.out.print("1 ");
                }
                if (i == j) {
                    System.out.print(count + " ");
                    count++;
                }
                if (i > j) {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
