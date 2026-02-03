import java.util.*;
public class MoveZeros{
	public static int[] move(int[] arr){
		int j = 0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]!= 0){
				arr[j] = arr[i];
				j++;
			}
		}
		while(j<arr.length){
			arr[j] = 0;
			j++;
		}
		return arr;
	}
	public static void main(String[] args){
		int[] arr = {1,0,2,3,0,0,5};
		System.out.println(Arrays.toString(move(arr)));
	}
}
