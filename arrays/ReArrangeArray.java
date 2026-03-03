import java.util.*;
public class ReArrangeArray{
	public static int[] rearrangeArray(int[] nums) {
        
        int[] arr = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < 0){
                arr[neg] = nums[i];
                neg += 2;
            }else{
                arr[pos] = nums[i];
                pos += 2;
            }
        }
        return arr;
    }
	public static void main(String[] args){
		int[] arr = {1,2,-3,-5,-7,5};
		System.out.println(Arrays.toString(rearrangeArray(arr)));
	}
}
