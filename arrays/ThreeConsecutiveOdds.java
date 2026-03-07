import java.util.*;
public class ThreeConsecutiveOdds{
	public static boolean threeConsecutiveOdds(int[] nums){
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] %2 != 0){
                count++;
            }else{
                count = 0;
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,34,3,4,5,7,23,12};
    	System.out.println(threeConsecutiveOdds(arr));
    }
}
