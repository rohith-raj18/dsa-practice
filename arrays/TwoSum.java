import java.util.*;
import java.util.Arrays;
public class TwoSum{
	public static int[] twoSum(int[] arr,int target){
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			int sum = arr[i]+arr[j];
			if(sum == target){
				return new int[]{i,j};
			}
			if(sum < target){
				i++;
			}else{
				j--;
			}
		}
		return new int[]{-1,-1};
		
	}
	public static void main(String[] args){
		int[] arr = {1,2,4,5,8,10};
		System.out.println(Arrays.toString(twoSum(arr,13)));
		
	}
}
