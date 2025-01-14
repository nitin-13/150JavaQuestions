package practicequestions_set_1;

import java.util.Scanner;

public class PalindromeString_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = in.nextLine();

        System.out.println("String before reversing: " + str);

        if (isEqual(str)) {
            System.out.println("Entered String is Palindrome");
        } else {
            System.out.println("Entered String is not Palindrome");
        }


    }

    static boolean isEqual(String str) {
        char[] strTemp = str.toCharArray();
        String strReversed = "";

        for (int i = strTemp.length - 1; i >= 0; i--) {
            strReversed += strTemp[i];
        }

        System.out.println("String after reversing: " + strReversed);
        return str.equalsIgnoreCase(strReversed);
    }
}
