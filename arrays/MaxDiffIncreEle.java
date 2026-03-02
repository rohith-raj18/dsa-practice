import java.util.*;
public class MaxDiffIncreEle{
	 public static int maximumDifference(int[] nums) {

        int j = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > j){

                max = Math.max(max,nums[i] - j);
            }else{
                j = nums[i];
            }

        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
    public static void main(String[] args){
        int[] arr = {98,56,23,86,2,34,69,99};
        System.out.println(maximumDifference(arr));
     }
}
