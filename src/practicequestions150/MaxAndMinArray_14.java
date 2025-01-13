package practicequestions150;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinArray_14 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 9, 57, 14, 1, 0};
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
        System.out.println("Minimum is -> " + arr[0] + " Maximum is -> " + arr[arr.length - 1]);
    }
}
