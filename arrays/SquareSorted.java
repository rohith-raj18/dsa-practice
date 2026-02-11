import java.util.*;
public class SquareSorted{
	public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[]  = new int[n];
        int l = 0;
        int r = n-1;
        int i = n-1;
        while(l<=r){
            int left = nums[l]*nums[l];
            int right = nums[r]*nums[r];
            if(left > right){
                res[i] = left;
                l++;
            }else{
                res[i] = right;
                r--;
            }
            i--;
        }
        return res;
    }
    public static void main(String[] args){
    	int[] arr = {-4,-1,0,3,10};
    	System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
