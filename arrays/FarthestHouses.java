import java.util.*;
public class FarthestHouses{
	public static int maxDistance(int[] nums) {
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    max = Math.max(max,(j-i));
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
    	int[] arr = {1,1,1,6,1,1,1};
    	System.out.println(maxDistance(arr));
    }
}
