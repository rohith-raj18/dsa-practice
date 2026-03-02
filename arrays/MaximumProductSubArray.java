import java.util.*;
public class MaximumProductSubArray{
	 public static int maxProduct(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        for(int i = 1;i<nums.length;i++){
            int curr = nums[i];

            if(curr < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(curr,max*curr);
            min = Math.min(curr,min*curr);
            res = Math.max(res,max);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,3,-1,2};
        System.out.println(maxProduct(arr));
     }
}
