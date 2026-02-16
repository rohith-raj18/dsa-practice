import java.util.*;
public class MaximumAverageSubarrayI{

    public static double findMaxAverage(int[] nums, int k) {
        
        double max = 0;
        int i = 0;
        int j = k;
        int sum = 0;
        for(int m = 0;m<k;m++){
            sum += nums[m];
            
        }
        max = (double)sum/k;
        while(j<nums.length){
            sum = sum - nums[i];

            sum = sum + nums[j];
            double avg = (double)sum/k;
            max = Math.max(max,avg);
            i++;
            j++;
        }
        return max;
    }
	public static void main(String[] args){
		int[] arr = {1,12,-5,-6,50,3};
		System.out.println(findMaxAverage(arr,4));
	}
}
