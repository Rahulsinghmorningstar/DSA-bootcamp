// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.*;
import java.io.*;
class shuffleArray {
    private static int[] shuffle(int[] nums, int n) {
        for(int i=n;i<2*n;i++){
            nums[i] = nums[i]<<10;
            nums[i] |= nums[i-n];
        }
        int z = n;
        for(int i=0;i<2*n;i+=2){
            nums[i] = nums[z] & 1023;
            nums[i+1] = nums[z++] >> 10;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] input = {2,5,1,3,4,7};
        int n = 3;
        int[] output = shuffle(input, n);
        for(int i=0;i<2*n;i++)
            System.out.print(output[i]+" ");
    }
}