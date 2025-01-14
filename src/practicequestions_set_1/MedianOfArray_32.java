package practicequestions_set_1;

import java.util.Arrays;

/*
Median is defined as the value which is present in the middle for a series of values.
Note, in order to find the median of an array of integers, we must make sure they are sorted.
 */
public class MedianOfArray_32 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 7};

        //sort the array
        Arrays.sort(arr);
        System.out.println("Sorted Array is -> " + Arrays.toString(arr));
        int len = arr.length;
        System.out.printf("Median of the given array is: " + medianOfArray(arr, len));
    }

    static double medianOfArray(int[] arr, int len) {
        int index1, index2;
        if (len % 2 == 0) {
            index1 = (len / 2) - 1;

            index2 = len / 2;

            return ((float) (arr[index1] + arr[index2]) / 2);
        } else
            return ((float) arr[len / 2]);
    }
}
