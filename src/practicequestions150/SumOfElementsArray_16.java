package practicequestions150;

public class SumOfElementsArray_16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        //Summing
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum -> " + sum);
    }
}
