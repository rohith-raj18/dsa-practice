import java.util.*;
public class SplitArrayLargestSum{
	public static int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            sum += nums[i];
        }
        if(k > nums.length){
            return -1;
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(split(nums,mid) > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static int split(int[] nums,int mid){
        int stud = 1;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(sum + nums[i] <= mid){
                sum += nums[i];
            }else{
                stud++;
                sum = nums[i];
            }
        }
        return stud;
    }
    public static void main(String[] args){
    	int[] arr = {7,2,5,10,8};
    	System.out.println(splitArray(arr,2));
    }
}
