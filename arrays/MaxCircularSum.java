import java.util.*;
public class MaxCircularSum {
    public static int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int max = nums[0];
        int min = nums[0];
        int currMax = 0;
        int currMin = 0;
        for(int i:nums){
            currMax = Math.max(i,currMax+i);
            max = Math.max(max,currMax);

            currMin = Math.min(i,currMin+i);
            min = Math.min(min,currMin);
            total += i;
        }
        if(max < 0){
            return max;
        }
        return Math.max(max,total - min);
    }
    public static void main(String[] args){
        int[] arr = {5,-3,-2,5};
        System.out.println(maxSubarraySumCircular(arr));
     }
}
