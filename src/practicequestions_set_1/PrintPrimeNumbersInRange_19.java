package practicequestions_set_1;

import java.util.Scanner;

public class PrintPrimeNumbersInRange_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range -> ");
        int start = in.nextInt();
        int end = in.nextInt();


        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

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
