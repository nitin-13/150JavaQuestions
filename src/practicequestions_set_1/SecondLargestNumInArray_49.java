package practicequestions_set_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumInArray_49 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 33, 99, 100, 45};

        int temp;
        //Sort the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Sorted array in Descending Order is " + Arrays.toString(arr));
        System.out.println("2nd Largest Element in the array is " + arr[1]);
    }
}
