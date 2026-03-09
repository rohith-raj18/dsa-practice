import java.util.*;
public class RemoveDuplicateII{
	 public static int removeDuplicates(int[] nums) {
	 // take intially j = 2 for atmost a element can repeate twice to check with third element
        int j = 2;
        for(int i = 2;i<nums.length;i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
    	int[] arr = {1,1,1,2,2,3};
    	System.out.println(removeDuplicates(arr));
    }
}
