import java.util.*;
public class FirstUniqueEven{
	public static int firstUniqueEven(int[] nums){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i:nums){
			map.put(i,map.getOrDefault(i,0)+1);
		}
		for(int j:nums){
			if(map.get(j) == 1 && j%2 == 0){
				return j;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {3,4,5,2,8,4};
		System.out.println(firstUniqueEven(arr));
	}
}
