import java.util.*;
public class LongestMountain{
	public static int longestMountain(int[] nums) {
        int up = 0;
        int down = 0;
        int maxlen = 0;
        for(int i = 1;i<nums.length;i++){
            if(down > 0 && nums[i] > nums[i-1] || nums[i] == nums[i-1]){
                down = 0;
                up = 0;
            }
            if(nums[i] > nums[i-1]){
                up++;
            }
            if(nums[i] < nums[i-1]){
                down++;
            }
            if(down > 0 && up > 0){
                maxlen = Math.max(maxlen,up+down+1);
            }
        }
        return maxlen;
    }
	public static void main(String[] args){
		int[] arr = {2,1,4,7,3,2,5};
		System.out.println(longestMountain(arr));
	}
}
