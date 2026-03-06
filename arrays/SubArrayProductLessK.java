import java.util.*;

public class SubArrayProductLessK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1;
        int l = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            prod *= nums[i];
            if(prod >= k){
                prod = prod/nums[l];
                l++;
            }
            count += (i-l)+1;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(arr,100));
     }
}
