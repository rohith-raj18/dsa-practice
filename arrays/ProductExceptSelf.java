import java.util.*;
public class ProductExceptSelf{
	public static int[] productExceptSelf(int[] nums) {
        int p[] = new int[nums.length];
        p[0] = 1;
        for(int i = 1;i<nums.length;i++){
            p[i] = p[i-1]*nums[i-1];
        }
        int r[] = new int[nums.length];
        r[nums.length-1] = 1;
        for(int i = nums.length-2;i>=0;i--){
            r[i] = r[i+1] * nums[i+1];
        }

        for(int i = 0;i<nums.length;i++){
            nums[i] = p[i] * r[i];
        }
        return nums;
    }
    public static void main(String[] args){
       int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
