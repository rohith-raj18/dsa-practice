import java.util.*;
public class KDiffpairs{
	public static int  diff(int[] nums,int k){
        int left = 0, right = 1;
        int count = 0;

        while (right < nums.length) {

            if (left == right) {
                right++;
                continue;
            }

            int diff = nums[right] - nums[left];

            if (diff == k) {
                count++;

                int leftVal = nums[left];
                int rightVal = nums[right];

                while (left < nums.length && nums[left] == leftVal) left++;
                while (right < nums.length && nums[right] == rightVal) right++;

            } else if (diff < k) {
                right++;
            }
            else {
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,7};
        System.out.println(diff(arr,2));
    }
}
