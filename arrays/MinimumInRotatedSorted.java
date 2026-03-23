import java.util.*;

public class MinimumInRotatedSorted {
    public static int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(i<=j){
            int mid = i+(j-i)/2;
            // firstly we check first and mid element if it is less it means it sorted then 
            //update minimum and move or else we check right portion and update min and move left
            if(nums[i] <= nums[mid]){
                min = Math.min(min,nums[i]);
                i = mid + 1;
            }else{
                min = Math.min(min,nums[mid]);
                j = mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args){
       int[] arr = {11,13,15,17};
        System.out.println(findMin(arr));
     }
}
