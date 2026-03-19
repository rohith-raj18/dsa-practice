import java.util.*;
public class MinimumConsecutiveCards{
	public static int minimumCardPickup(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prev = i - map.get(nums[i])+1;
                min = Math.min(min,prev);
            }
            map.put(nums[i],i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public static void main(String[] args){
    	int[] arr = {3,4,2,3,4,7};
    	System.out.println(minimumCardPickup(arr));
    }
}
