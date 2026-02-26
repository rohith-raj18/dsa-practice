import java.util.*;
public class SumOfVariableLength {
    public static int subarraySum(int[] nums) {
        int p[] = new int[nums.length];
        p[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            p[i] = p[i-1]+nums[i];
        }
        int sum = 0;
        for(int i = 0;i<p.length;i++){
            int start = i - nums[i];
            if(start < 0){
                start = 0;
            }
            if(start == 0){
                sum += p[i];
            }else{
                sum += p[i] - p[start - 1];
            }
        }
        return sum;

    }
    public static void main(String[] args){
       int[] arr = {1,4,2,5,3};
        System.out.println(subarraySum(arr));
    }
}
