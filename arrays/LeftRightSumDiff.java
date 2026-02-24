import java.util.*;
public class LeftRightSumDiff{
	 public static int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int left = 0;

        for(int j = 0;j<nums.length;j++){
            int curr = nums[j];
            int right = sum - left - nums[j];
            nums[j] = Math.abs(left - right);
            left += curr;
        }
        return nums;
    }
	public static void main(String[] args){
		int arr[] = {10,4,8,3};
		System.out.println(Arrays.toString(leftRightDifference(arr)));
	}
}
