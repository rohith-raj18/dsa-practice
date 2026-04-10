import java.util.*;
public class MinimumDistanceBlwThree{
	public static int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                for(int k = 0;k<nums.length;k++){
                    if((i != j && j != k && k!= i) && nums[i] == nums[j] && nums[k] == nums[j]){
                        sum = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        min = Math.min(sum,min);
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1:min;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,1,1,3};
    	System.out.println(minimumDistance(arr));
    }
}
