import java.util.*;
public class SmallStableII{
	public static int firstStableIndex(int[] nums, int k) {
        int suffix[] = new int[nums.length];
        suffix[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            suffix[i] = Math.min(nums[i],suffix[i+1]);
        }
        int max = Integer.MIN_VALUE;
        for(int j = 0;j<nums.length;j++){
            max = Math.max(max,nums[j]);
            if(max - suffix[j] <= k){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args){
    	int[] arr = {5,0,1,4};
    	System.out.println(firstStableIndex(arr,3));
    }
}
