package practicequestions_set_1;

public class MultiplicationTable_18 {
    public static void main(String[] args) {
        int n = 10;

        //Below code is to print multiplication table of 10 in reverse order
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}
