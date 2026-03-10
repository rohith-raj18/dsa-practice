import java.util.*;
public class SubarraysWithEqualSum{
	public static boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 0;i<nums.length-1;i++){
            sum = nums[i] + nums[i+1];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args){
    	int[] arr = {4,2,4};
    	System.out.println(findSubarrays(arr));
    }
}
