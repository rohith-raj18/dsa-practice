import java.util.*;
public class Frequency{
	public static int frequency(int[] arr){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        int k = 0;
        for(int each : arr){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > k){
                k = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2, 3,4,4, 4,5};
        System.out.println(frequency(arr));
    }
}
