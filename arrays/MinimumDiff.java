import java.util.*;
public class MinimumDiff{
	 public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<=nums.length-k;i++){
            int curr = nums[i + k -1] - nums[i];
            min = Math.min(min,curr);
        }
        return min;
    }
	public static void main(String[] args){
		int[] arr = {9,4,1,7};
		System.out.println(minimumDifference(arr,2));
	}
}
