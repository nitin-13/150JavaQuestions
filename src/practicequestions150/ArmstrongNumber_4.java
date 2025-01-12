package practicequestions150;

import java.util.Scanner;

public class ArmstrongNumber_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num, sum = 0;

        //Get the order of the number

        int order = getOrder(num);

        checkArmstrong(num, order);

    }

    static int getOrder(int num) {

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static void checkArmstrong(int num, int order) {

        int temp = num, sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = (int) (sum + Math.pow(rem, order)); //Math.pow returns double hence typecasted to int
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
