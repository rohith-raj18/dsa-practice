import java.util.*;
public class ContinousSubArraySum{
	 public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            int rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                int prev = map.get(rem);
                if(i-prev >= 2){
                    return true;
                }
            }else{
                map.put(rem,i);
            }
        }
        return false;
    }
    public static void main(String[] args){
    	int[] arr = {23,2,4,6,7};
    	System.out.println(checkSubarraySum(arr,6));
    }
}
