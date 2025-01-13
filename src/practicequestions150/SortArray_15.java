package practicequestions150;

import java.util.Arrays;

public class SortArray_15 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int temp = 0;
        //Sort the Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting -> " + Arrays.toString(arr));
    }
}
