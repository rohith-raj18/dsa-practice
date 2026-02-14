import java.util.*;

public class LongestSubArraySum {
    public static int longestSubArray(int[] arr,int k) {

        int max = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i<arr.length){
            sum = sum+arr[i++];

            if(sum > k){
                sum = sum- arr[j];
                j++;
            }
            max = Math.max(max,(i-j));
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        System.out.println(longestSubArray(arr,15));
    }
}
