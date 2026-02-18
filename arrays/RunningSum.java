import java.util.*;
public class RunningSum{
	public static int[] runningSum(int[] nums) {
        int [] p = new int[nums.length];
        p[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            p[i] = p[i-1]+nums[i];
        }
        return p;
    }
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(arr)));
	}
}
