import java.util.*;
public class MaxSumWithExactlyKElements{
	public static int maximizeSum(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i:nums){
            max = Math.max(max,i);
        }
        for(int i = 0;i<k;i++){
            sum += max;
            max += 1;
            
        }
        return sum;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,3,4,5};
    	System.out.println(maximizeSum(arr,3));
    }
}
