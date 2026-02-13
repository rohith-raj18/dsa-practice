import java.util.*;

public class MaxSubArraySumOfSizeK {


        public static int sum(int[] arr,int k) {
           int sum = 0;
           int i = 0;
           int j = k;
           int max = 0;
           if(arr == null || k> arr.length){
               return 0;
           }
           for(int n = 0;n<j;n++){
               sum += arr[n];
           }
           while(j<arr.length){
               sum = sum - arr[i];

               sum = sum + arr[j];
               max = Math.max(sum,max);
               i++;
               j++;
           }

            return max;
        }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1,2};
        System.out.println(sum(arr,3));
    }
}
