package practicequestions150;

import java.util.Scanner;

public class CheckPerfectNumber_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }

    static boolean isPerfect(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
}
