import java.util.*;
public class Duplicate{

	public static int removeDuplicates(int[] arr){
		int j = 0;
		for(int i = 1;i<arr.length;i++){
			if(arr[j] != arr[i]){
				arr[j+1] = arr[i];
				j++;
			}
		}
		return j+1;
	}
	public static void main(String[] args){
		int [] arr = {1,2,2,3,3,4,5};
		int k = removeDuplicates(arr);
		for(int i = 0;i<k;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
