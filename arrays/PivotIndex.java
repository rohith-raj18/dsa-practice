import java.util.*;
public class PivotIndex{
	public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int left = 0;
        for(int i =0;i<nums.length;i++){
            int right = sum - left - nums[i];
            if(left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
	public static void main(String[] args){
		int[] arr = {2,1,-1};
		System.out.println(pivotIndex(arr));
	}
}
