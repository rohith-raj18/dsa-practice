import java.util.*;

public class MaximumSubArraySum {
    public static long maximumSubarraySum(int[] arr,int k) {

        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        long sum = 0;
        long max = 0;
        for(int j = 0;j<arr.length;j++){

            while(set.contains(arr[j])){
                set.remove(arr[i]);
                sum = sum-arr[i];
                i++;
            }
            set.add(arr[j]);
            sum += arr[j];

            if(j-i+1 == k){
                max = Math.max(sum,max);
                set.remove(arr[i]);
                sum -= arr[i++];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {4,2,3,6,9,9,9};
        System.out.println(maximumSubarraySum(arr,3));
    }
}
