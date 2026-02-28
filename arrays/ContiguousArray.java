import java.util.*;
public class ContiguousArray{
	public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int balance = 0;
        int maxlen = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                balance++;
            }else{
                balance--;
            }
            if(map.containsKey(balance)){
                maxlen = Math.max(maxlen,i - map.get(balance));
            }else{
                map.put(balance,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] arr = {0,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(arr));
     }
}
