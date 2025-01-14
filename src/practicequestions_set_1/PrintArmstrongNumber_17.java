package practicequestions_set_1;

import java.util.Scanner;

public class PrintArmstrongNumber_17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the range -> ");
        int start = in.nextInt();
        int end = in.nextInt();


        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int num) {
        int temp = num, sum = 0, order = 0;
        int original = num;
        while (num > 0) {
            num = num / 10;
            order++;
        }

        while (temp > 0) {
            int rem = temp % 10;
            sum = (int) (sum + Math.pow(rem, order)); //Math.pow returns double hence typecasted to int
            temp = temp / 10;
        }

        return original == sum;
    }
}
