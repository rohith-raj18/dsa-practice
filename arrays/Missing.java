import java.util.*;
public class Missing{
	public static int missingElement(int[] arr){
		HashSet<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int num : arr){
			set.add(num);
			min = Math.min(min,num);
			max = Math.max(max,num);
		}
		for(int i = min;i<=max;i++){
			if(!set.contains(i)){
				return i;
			}
		}
		int missing = 0;
		while(set.contains(missing)){
			missing++;
		}
		return missing;
	}
	public static void main(String[] args){
		int[] arr = {1,2,4,5};
		System.out.println(missingElement(arr));
	}
}
