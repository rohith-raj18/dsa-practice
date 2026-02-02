import java.util.*;
public class TwoSumH{
	public static int[] twosum(int[] arr,int target){
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++){
			 int complement = target - arr[i];
			 if(map.containsKey(complement)){
			 	return new int[]{map.get(complement),i};
			 }
			 map.put(arr[i],i);
			}
		return new int[]{-1,-1};
	}
	
	public static void main(String[] args){
		int[] arr = {1,3,5,6,7};
		System.out.println(Arrays.toString(twosum(arr,11)));
	}
}
