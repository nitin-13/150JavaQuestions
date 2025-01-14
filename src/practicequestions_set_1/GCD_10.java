package practicequestions_set_1;

import java.util.Scanner;

public class GCD_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int gcd = getGCD(a, b);
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is -> " + gcd);
    }

    static int getGCD(int a, int b) {

        int min = Math.min(a, b);

        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
