import java.util.*;
public class CountDigitAppear{
	public static int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == digit){
                count++;
                continue;
                
            }else {
                int temp = Math.abs(nums[i]);
                while(temp > 0){
                    if(temp %10 == digit){
                        count++;
                    }
                    temp /= 10;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
    	int[] arr = {12,54,32,22};
    	System.out.println(countDigitOccurrences(arr,2));
    }
}
