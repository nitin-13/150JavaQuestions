package practicequestions150;

import java.util.Scanner;

public class ReverseString_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String str = in.nextLine();

        System.out.println("String before reversing: " + str);
        String strReversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strReversed += str.charAt(i);
        }

        System.out.println("String after reversing: " + strReversed);
    }
}
