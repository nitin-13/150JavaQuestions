package practicequestions150;

import java.util.Scanner;

public class PalindromeNumber_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        isPalindrome(num);
    }

    static void isPalindrome(int num) {
        int temp = num;
        int reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }

        if (reversed == temp) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        ;
    }
}
