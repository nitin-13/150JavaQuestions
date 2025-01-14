package practicequestions_set_1;

import java.util.Scanner;

public class SumPrimeRange_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range -> ");
        int start = in.nextInt();
        int end = in.nextInt();

        int sumOfPrime = sumPrimeRange(start, end);

        System.out.println("Sum of Prime Nos. between " + start + " and " + end + " is -> " + sumOfPrime);
    }

    private static int sumPrimeRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;

    }
}
