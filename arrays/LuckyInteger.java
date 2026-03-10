import java.util.*;
public class LuckyInteger {
    public static int findLucky(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = -1;
        for(int key : map.keySet()){
            if(key == map.get(key)){
                max = Math.max(max,key);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3};
        System.out.println(findLucky(arr));
     }
}
