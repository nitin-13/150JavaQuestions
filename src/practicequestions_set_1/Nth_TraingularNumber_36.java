package practicequestions_set_1;

import java.util.Scanner;

public class Nth_TraingularNumber_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number at which triangular number should be generated -> ");
        int end = in.nextInt();

        int triangularNumber = 0;
//
//        for (int i = 1; i <= end; i++) {
//            triangularNumber += i;
//        }


        triangularNumber = (end * (end + 1)) / 2;

        System.out.println(triangularNumber);
    }
}
