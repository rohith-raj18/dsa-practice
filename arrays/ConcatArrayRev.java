import java.util.*;
public class ConcatArrayRev{
	public static int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        
        int[] rev = new int[nums.length];
        int j = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            rev[i] = nums[j];
            j--;
        }
        int k = 0;
        for(int i = nums.length;i<arr.length;i++){
            arr[i] = rev[k];
            k++;
        }
        return arr;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,3};
    	System.out.println(Arrays.toString(concatWithReverse(arr)));
    }
}
