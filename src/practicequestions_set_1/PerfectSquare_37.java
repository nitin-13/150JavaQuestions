package practicequestions_set_1;

import java.util.Scanner;

public class PerfectSquare_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to be checked for perfect square - ");
        int num = in.nextInt();

        if (isPerfectSquare(num)) {
            System.out.println(num + " is a Perfect Square");
        } else {
            System.out.println(num + " is not a Perfect Square");
        }
    }

    private static boolean isPerfectSquare(int num) {
        int sqRT = 0;
        if (num >= 0) {
            sqRT = (int) Math.sqrt(num);

        }
        return sqRT == (int) sqRT;
    }
}
