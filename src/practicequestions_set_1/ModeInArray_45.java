package practicequestions_set_1;

public class ModeInArray_45 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};

        int maxValue = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > 0) {
                maxValue = nums[i];
            }
        }

        System.out.println("Mode is " + maxValue);


    }
}
