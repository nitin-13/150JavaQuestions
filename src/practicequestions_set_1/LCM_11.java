package practicequestions_set_1;

import java.util.Scanner;

public class LCM_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int gcd = getLCM(a, b);
        System.out.println("Least Common Multiple of " + a + " and " + b + " is -> " + gcd);
    }

    static int getLCM(int a, int b) {

        int max = a > b ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }
}
