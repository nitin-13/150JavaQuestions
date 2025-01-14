package practicequestions_set_1;

import java.util.Scanner;

public class PrimeNumberRange_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int range = in.nextInt();

        for (int i = 2; i < range; i++) {
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
