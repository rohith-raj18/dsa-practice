import java.util.*;

public class MinimumSubArraySum {
    public static int minimumSubArray(int[] arr,int k) {
		// k denotes size of sub array//
        int min = Integer.MAX_VALUE;
        int m = 0;
        int j = k;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        min = sum;
        while(j<arr.length){
            sum = sum - arr[m];

            sum = sum + arr[j];

            min = Math.min(sum,min);
            m++;
            j++;
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {1,5,2,7,1,9};
        System.out.println(minimumSubArray(arr,3));
    }
}
