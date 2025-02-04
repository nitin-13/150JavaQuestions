package practicequestions_set_2;

public class BalancedBrackets_14 {
    public static void main(String[] args) {
        String str = "{[()]}";
        boolean palin = true;

        //Check if string is palindrome

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            System.out.println(start + " " + end + " " + (start == end));
            if (start != end) {
                palin = false;
            }
        }
        System.out.println(palin);

        if (palin) {
            System.out.println("String is balanced");
        } else {
            System.out.println("String is not balanced");
        }

    }
}
