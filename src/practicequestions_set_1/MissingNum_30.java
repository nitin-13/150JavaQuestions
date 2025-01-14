package practicequestions_set_1;

public class MissingNum_30 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println("Missing Number is -> " + (arr[i] + 1)); //3 is missing, a[i] is 2 so we need to add 1
                break;
            }
        }
    }
}
