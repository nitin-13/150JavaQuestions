package practicequestions_set_1;

import java.util.Scanner;

//Logic
// Year should be divisible by 400
//           OR
// Year should be divisible 4 and not by 100
public class LeapYear_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        boolean isLeap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println("leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
