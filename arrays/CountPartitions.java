import java.util.*;
public class CountPartitions{
	public static int countPartitions(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int i: nums){
            sum += i;
        }
        int left = 0;
        for(int i = 0;i<nums.length-1;i++){
            left += nums[i];
            int right = sum - left;
            if((left - right) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,10,3,7,6};
        System.out.println(countPartitions(arr));
    }
}
