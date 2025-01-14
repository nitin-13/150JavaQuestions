package practicequestions_set_1;

import java.util.Scanner;

public class PowerOfNumber_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and power -> ");
        int num = sc.nextInt();
        int pow = sc.nextInt();

        int ans = (int) Math.pow(num, pow);

        System.out.println("Answer is -> " + ans);
    }
}
