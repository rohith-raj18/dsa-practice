import java.util.*;
public class KokoEatingBananas{
	public static int minEatingSpeed(int[] nums, int h) {
        int i = 1;
        int j = max(nums);
        while(i<=j){
            int mid = i + (j-i)/2;
            int totalH = totalHours(nums,mid);
            if(totalH <= h){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
            
        }
        return i;
    }
    public static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int totalHours(int[] nums,int h){
        int total = 0;
        for(int i = 0;i<nums.length;i++){
            total += Math.ceil((double)nums[i]/(double)h);
        }
        return total;
    }
    public static void main(String[] args){
    	int[] piles = {3,6,7,11};
    	System.out.println(minEatingSpeed(piles,8));
    }
}
