package practicequestions_set_1;

import java.util.Scanner;

public class SumOfDigitsOfFact_28 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        int sum = sumOfDigits(factorial(num));

        System.out.println("Sum -> " + sum);
    }


    static int factorial(int num) {
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        return fact;

    }

    static int sumOfDigits(int num) {
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
