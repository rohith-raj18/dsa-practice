import java.util.*;

public class MaxAbsoluteSum {
    public static int maxAbsoluteSum(int[] nums) {
       int sum = 0;
       int max = 0;
       int min = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max,sum);
            min = Math.min(min,sum);
        }
        return max - min;
    }
    public static void main(String[] args){
        int[] arr = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(arr));
     }
}
