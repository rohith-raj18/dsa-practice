import java.util.*;
public class MaxStrongPair{
	 public static int maximumStrongPairXor(int[] nums) {
        int max = 0;
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i],nums[j])){
                    xor = nums[i] ^ nums[j];
                    max = Math.max(max,xor);
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,3,4,5};
    	System.out.println(maximumStrongPairXor(arr));
    }
}
