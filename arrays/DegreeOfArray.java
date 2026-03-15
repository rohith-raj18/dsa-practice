import java.util.*;
public class DegreeOfArray{
	public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        int len = Integer.MAX_VALUE;
        int degree = 0;
        for(int i = 0;i<nums.length;i++){
            map.putIfAbsent(nums[i],i);

            count.put(nums[i],count.getOrDefault(nums[i],0)+1);

            if(count.get(nums[i]) > degree){
                degree = count.get(nums[i]);
                len = i - map.get(nums[i]) + 1;
            }
            else if(count.get(nums[i]) ==  degree){
                len = Math.min(len,i - map.get(nums[i])+1);
            }
        }
        return len;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,2,3,1};
    	System.out.println(findShortestSubArray(arr));
    }
}
