import java.util.*;
public class MinSizeSubArraySum{

	public static int minSubArrayLen(int target, int[] arr){
       int min = Integer.MAX_VALUE;
       int j = 0;
       int sum = 0;
       for(int i = 0;i<arr.length;i++){
        sum += arr[i];
        while(sum >= target){
            min = Math.min(min,(i-j)+1);
            sum -= arr[j];
            j++;
        }
        
       }
       return min == Integer.MAX_VALUE ? 0 : min;
    }
	public static void main(String[] args){
		int[] arr = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7,arr));
	}
}
