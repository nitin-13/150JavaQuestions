package practicequestions_set_2;

import java.util.Scanner;

/*
Series = 1 + 1/2 + 1/3 + . . . . . + 1/n
 */

public class SumOfSeries_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range : ");
        int n = in.nextInt();

        float sum = 0f;

        for (int i = 1; i <= n; i++) {
            sum += ((float) 1 / i);
        }
        System.out.println(sum);
    }
}
