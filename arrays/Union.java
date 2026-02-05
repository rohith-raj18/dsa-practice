import java.util.*;
public class Union{
	public static int[] union(int[] arr,int [] nums){
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr){
			set.add(i);
		}
		for(int j : nums){
			set.add(j);
		}
		int[] res = new int[set.size()];
		int index = 0;
		for(int each: set){
			res[index++] = each;
		}
		return res;
	}
	public static void main(String[] args){
		int[] arr = {1,1,2,5,6,3,4};
		int[] nums = {1,4,5,7,8,9};
		int[] res = new int[arr.length+nums.length];
		System.out.println(Arrays.toString(union(arr,nums)));
	}
}
