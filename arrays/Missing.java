import java.util.*;
public class Missing{
	public static int missingElement(int[] arr){
		
		for(int i = 0;i<arr.length-1;i++){
			if(arr[i+1]-arr[i] != 1){
				return arr[i]+1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,2,4,5};
		System.out.println(missingElement(arr));
	}
}
