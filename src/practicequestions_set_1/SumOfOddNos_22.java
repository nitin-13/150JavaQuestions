package practicequestions_set_1;

import java.util.Scanner;

public class SumOfOddNos_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range to find sum of odd nos. -> ");
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println("Sum of odd nos. between " + start + " and " + end + " is -> " + oddSum(start, end));
    }

    static int oddSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
