package practicequestions_set_2;


public class FibonacciMatrix_12Pending {
    public static void main(String[] args) {

        int size = 3;

        int[][] fiboMatrix = new int[size][size];

        for (int i = 0; i < fiboMatrix.length; i++) {
            for (int j = 0; j < fiboMatrix[i].length; j++) {
                printFibo(fiboMatrix[i].length);
            }
            System.out.println();

        }


    }

    static void printFibo(int n) {
        int n1 = 0, n2 = 1, n3;

        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
