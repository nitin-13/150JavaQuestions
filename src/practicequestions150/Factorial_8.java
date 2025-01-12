package practicequestions150;

import java.util.Scanner;

public class Factorial_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = in.nextInt();

        System.out.println("Factorial of the entered number is: " + factorial(num));
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
}
