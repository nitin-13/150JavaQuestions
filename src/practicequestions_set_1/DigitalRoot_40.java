package practicequestions_set_1;

import java.util.Scanner;

public class DigitalRoot_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to find digital root -> ");
        int num = in.nextInt();

        int digitalRoot = (num % 9 == 0) ? 9 : (num % 9);

        System.out.println("Digital Root is : " + digitalRoot);

    }
}
