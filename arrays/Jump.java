import java.util.*;
public class Jump{
	public static boolean canJump(int[] nums) {
        int jump = 0;
        for(int i = 0;i<nums.length;i++){
            if(i > jump){
                return false;
            }
            jump = Math.max(jump,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args){
    	int[] arr = {1,3,0,-1,5};
    	System.out.println(canJump(arr));
    }
}
