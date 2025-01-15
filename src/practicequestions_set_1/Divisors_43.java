package practicequestions_set_1;

import java.util.Arrays;
import java.util.Scanner;

public class Divisors_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = in.nextInt();


        System.out.print("Divisors are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
