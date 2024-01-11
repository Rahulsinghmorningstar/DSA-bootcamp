// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]

public class RunningSumArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int sum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            sum += nums[i];
            ans[i] = sum;
            System.out.println(ans[i]);
        }
    }
}
