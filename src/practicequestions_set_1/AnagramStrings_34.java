package practicequestions_set_1;

import java.util.Arrays;

public class AnagramStrings_34 {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        boolean check = isAnagram(str1, str2);
        if (check) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("String are not Anagram");
        }

    }

    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) { //length check
            return false;
        }
        //conversion to char array, so that we can check each element
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //char[] ch3 = str2.replaceAll("//s", "").toLowerCase().toCharArray(); // remove whitespace.

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
