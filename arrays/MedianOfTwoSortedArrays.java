import java.util.*;

public class MedianOfTwoSortedArrays {

    public static double  median(int[] arr, int[] nums){

        int i = 0;
        int j = 0;
        int [] res = new int[arr.length+nums.length];
        int k = 0;
        while(i<arr.length&& j<nums.length){
            if(arr[i]<nums[j]){
                res[k] = arr[i];
                k++;
                i++;
            }else{
                res[k] = nums[j];
                k++;
                j++;
            }
        }
        while(i<arr.length){
            res[k++] = arr[i++];
        }
        while(j<nums.length){
            res[k++] = nums[j++];
        }
        int m = res.length;
        int mid = m/2;
        if(m%2 == 0){
            return (res[mid-1] + (res[mid]))/2.0;
        }
        return res[mid];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        int[] nums= {2,3,5,6,7,8};
        System.out.println(median(arr,nums));
    }
}
