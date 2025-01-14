package practicequestions_set_1;

import java.util.Scanner;

/*
1
2 3
4 5 6
*/

public class NumberPattern_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        int count = 1; //to print pattern
        for (int i = 1; i <= rows; i++) { //rows
            for (int j = 1; j <= rows; j++) { //columns
                if (i >= j) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
