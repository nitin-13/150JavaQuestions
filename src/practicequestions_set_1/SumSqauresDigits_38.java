package practicequestions_set_1;

public class SumSqauresDigits_38 {
    public static void main(String[] args) {
        int num = 123;

        System.out.println("Sum of Sqaures of digits of " + num + " -> " + sumSqDigits(num));

    }

    static int sumSqDigits(int num) {
        int digit = 0, sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum = (int) (sum + Math.pow(digit, 2));
            num /= 10;
        }
        return sum;
    }
}
