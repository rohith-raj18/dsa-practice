import java.util.*;

public class BinarySubarraysWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            int second = sum - goal;
            if(map.containsKey(second)){
                count += map.get(second);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,1,0,0};
        System.out.println(numSubarraysWithSum(arr,2));
     }
}
