package practicequestions_set_2;

/*
Approach ->
- We will use a tempSum string to store the number
- Using a for loop we will iterate through the string and if we encounter a number we will add this number to our tempSum.
- If we encounter an alphabet , we will add the value of tempSum to the final result and empty the tempSum to get a new number in the string.
- Finally we print the result.
 */

public class SumOfNumbersInString_15 {
    public static void main(String[] args) {
        String str = "The numbers are 12 and 34";

        int sum = findSum(str);
        System.out.println("Sum of numbers in a string is : " + sum);

    }

    static int findSum(String str) {
        int sum = 0;
        String tempSum = "0";

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
//            System.out.print("Iteration -> " + (i + 1));
//            System.out.print(" Char is -> " + s);

            if (Character.isDigit(s)) {
                tempSum += s;
//                System.out.println(" TempSum -> " + tempSum);
            } else {
                sum += Integer.parseInt(tempSum);
//                System.out.println(" Sum -> " + sum);
                tempSum = "0";
            }
        }
        return sum += Integer.parseInt(tempSum);
    }
}
