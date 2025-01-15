package practicequestions_set_1;

import java.util.Scanner;

public class PrimeFactors_48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number -> ");
        int num = in.nextInt();

        int sum = 0;


        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }
        System.out.print("Sum of Prime factors are -> " + sum);
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
