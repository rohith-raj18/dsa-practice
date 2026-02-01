import java.util.*;
public class Unique{
	public static int uniqueElement(int[] arr){
		int j = 0;
		for(int i : arr){
			j ^= i;
		}
		return j;
	}
	public static void main(String[] args){
		int[] arr = {1,1,2,2,3,4,4};
		System.out.println(uniqueElement(arr));
	}
}
