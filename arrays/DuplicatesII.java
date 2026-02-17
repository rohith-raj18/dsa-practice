import java.util.*;
public class DuplicatesII{
	public static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int prev = map.get(arr[i]);

                if(i - prev <= k){
                    return true;
                }
            }
            map.put(arr[i],i);
        }
        return false;
    }
	public static void main(String[] args){
		int[] arr = {1,2,3,1};
		System.out.println(containsNearbyDuplicate(arr,3));
	}
}
