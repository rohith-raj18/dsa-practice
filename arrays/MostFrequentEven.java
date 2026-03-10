import java.util.*;
public class MostFrequentEven{
	public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            if(i%2 == 0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int max = -1;
        int count = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > count || (freq == count && key < max)){
                count = freq;
                max = key;
            }
        }
        return max;
    }
    public static void main(String[] args){
    	int[] arr = {0,1,2,2,4,4,1};
    	System.out.println(mostFrequentEven(arr));
    }
}
