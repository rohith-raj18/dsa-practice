import java.util.*;
public class ContainsDuplicate{
	public static boolean found(int[] arr){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				return true;
			}
			map.put(arr[i],1);
		}
		return false;
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,3,4,5,5};
		System.out.println(found(arr));
	}
}
