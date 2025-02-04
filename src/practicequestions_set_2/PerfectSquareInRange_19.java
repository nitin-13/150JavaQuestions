package practicequestions_set_2;


import java.util.Scanner;

public class PerfectSquareInRange_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Perfect Squares between " + start + " and " + end + " are -> ");
        for (int i = start; i <= end; i++) {
            if (isPerfectSquare(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPerfectSquare(int num) {
        int sqRT = 0;
        if (num >= 0) {
            sqRT = (int) Math.sqrt(num);

        }
        return num == sqRT * sqRT;
    }
}
