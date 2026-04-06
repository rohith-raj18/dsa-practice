import java.util.*;
public class DivideArrayIntoEqualPairs{
	public static boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int n = nums.length/2;
        if(nums.length%2 != 0){
            return false;
        }
        for(int i:freq){
            if(i % 2 != 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args){
    	int[] nums = {2,3,2,2,3,2};
    	System.out.println(divideArray(nums));
    }
}
