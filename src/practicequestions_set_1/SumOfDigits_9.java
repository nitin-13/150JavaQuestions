package practicequestions_set_1;

import java.util.Scanner;

public class SumOfDigits_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;

//        while (num > 0) {
//            sum += (num % 10);
//            num /= 10;
//        }

        for (int i = num; i > 0; i--) {
            sum += (num % 10);
            num /= 10;
        }

        System.out.println("Sum of digits is -> " + sum);
    }
}
