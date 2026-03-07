import java.util.*;
public class NoOfGoodPairs{
	public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count += map.get(nums[i]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
	public static void main(String[] args){
		int arr[] = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(arr));
	}
}
