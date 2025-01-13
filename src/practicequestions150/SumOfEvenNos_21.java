package practicequestions150;

import java.util.Scanner;

public class SumOfEvenNos_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range to find sum of even nos. -> ");
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println("Sum of even nos. between " + start + " and " + end + " is -> " + evenSum(start, end));
    }

    static int evenSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
