import java.util.*;

public class SignOfProduct {
    public static int arraySign(int[] nums) {
        int sign = 1;
        for(int i:nums){
            if(i == 0){
                return 0;
            }else if(i < 0){
                sign *= -1;
            }
        }
        return sign;

    }
    public static void main(String[] args){
       int[] arr = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(arr));

     }
}
