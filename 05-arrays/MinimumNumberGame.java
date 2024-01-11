import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String args[]) {
        int[] nums = {5,4,3,2};
        Arrays.sort(nums);
        for (int index = 0; index < nums.length; index+=2) {
            final int temp = nums[index];
            nums[index] = nums[index +1];
            nums[index+1] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
