import java.util.*;
public class SearchPosition{
	public static int search(int[] arr,int target){
		int i = 0;
		int j = arr.length-1;
		int mid = 0;
		while(i<=j){
			mid = i + (j-i)/2;
			if(target == arr[mid]){
				return mid;
			}else if(target < arr[mid]){
				j = mid-1;
			}else{
				i = mid + 1;
			}
		}
		return i;	
	}
	public static void main(String[] args){
		int[] arr = {1,3,5,6};
		System.out.println(search(arr,7));	
	}
}
