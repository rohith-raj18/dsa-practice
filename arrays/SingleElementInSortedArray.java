import java.util.*;
public class SingleElementInSortedArray{
	public static int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int mid = i + (j-i)/2;
            if(mid %2 == 0){
                if(nums[mid] == nums[mid + 1]){
                    i = mid + 2;
                }else{
                    j = mid-1;
                }
            }else{
                if(nums[mid] == nums[mid - 1]){
                    i = mid + 1;
                }else{
                    j = mid - 1;
                }
            }
            
        }
        return nums[i];
    }
    public static void main(String[] args){
    	int[] arr = {1,1,2,3,3,4,4,5,5};
    	System.out.println(singleNonDuplicate(arr));
    }
}
