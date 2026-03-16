import java.util.*;
public class Sqrt{
	 public static int mySqrt(int x) {
        long i = 1;
        long j = x/2;
        if(x < 2){
            return x;
        }
        while(i<=j){
            long mid = i + (j-i)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            if(mid * mid < x){
                i = mid + 1;
            }else{
                j = mid -1;
            }
        }
        return (int)j;
    }
    public static void main(String[] args){
    	System.out.println(mySqrt(8));
    }
}
