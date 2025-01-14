package practicequestions_set_1;

import java.util.Scanner;

public class CountDigits_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Integer number = in.nextInt();
        //System.out.println("No. of digits in " + number + " -> " + number.toString().length());
        System.out.println("No. of digits in " + number + " -> " + countDigits(number));
    }

    static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
