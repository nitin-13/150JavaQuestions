package practicequestions_set_1;

import java.util.Arrays;
import java.util.Objects;

public class CountDigitNumber_41 {
    public static void main(String[] args) {
        Integer num = 122333;
        int key = 3, count = 0;

        String number = Integer.toString(num);

        System.out.println(number);

        for (int i = 0; i < number.length(); i++) {
            if ((int) (number.charAt(i)) == key) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(key + " found " + count + " times in " + num);
        } else {
            System.out.println(key + " not found in " + num);
        }

    }
}
