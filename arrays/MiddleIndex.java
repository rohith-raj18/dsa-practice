import java.util.*;
public class MiddleIndex{
	public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int left = 0;
        for(int i = 0;i<nums.length;i++){
            int right = sum - left - nums[i];

            if(left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
	public static void main(String[] args){
		int[] arr = {2,3,-1,8,4};
		System.out.println(findMiddleIndex(arr));
	}
}
