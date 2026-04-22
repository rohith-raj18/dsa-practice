import java.util.*;
public class Thirdmax{
	public static int thirdMax(int[] nums) {
     
    Long max = Long.MIN_VALUE;
    Long second = Long.MIN_VALUE;
    Long third = Long.MIN_VALUE;

    for (int num : nums) {
      
        if (num == max || num == second || num == third) continue;

        if (num > max) {
            third = second;
            second = max;
            max = (long) num;
        } else if (num > second) {
            third = second;
            second = (long) num;
        } else if (num > third) {
            third = (long) num;
        }
    }

   
    return third == Long.MIN_VALUE ? max.intValue() : third.intValue();

    }
    public static void main(String[] args){
    	int[] arr = {1,2,3};
    	System.out.println(thirdMax(arr));
    }
}
