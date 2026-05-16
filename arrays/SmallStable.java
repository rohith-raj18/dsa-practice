import java.util.*;
public class SmallStable{
	public static int firstStableIndex(int[] nums, int k) {

    for (int i = 0; i < nums.length; i++) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int j = 0; j <= i; j++) {
            max = Math.max(max, nums[j]);
        }

   
        for (int j = i; j < nums.length; j++) {
            min = Math.min(min, nums[j]);
        }

   
        if (max - min <= k) {
            return i;
        }
    }

    return -1;
    }
    public static void main(String[] args){
    	int[] arr = {5,0,1,4};
    	System.out.println(firstStableIndex(arr,3));
    }
}
