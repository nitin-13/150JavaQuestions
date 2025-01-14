package practicequestions_set_1;

import java.util.Scanner;

public class VowelsAndConsonants_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int vowCount = 0, conCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowCount++;
            } else conCount++;
        }
        System.out.println("Vowels Count -> " + vowCount + " and Consonants Count -> " + conCount);
    }
}
