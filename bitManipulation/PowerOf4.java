import java.util.*;
public class PowerOf4{
	public static boolean isPowerOfFour(int n) {
        boolean flag = (n > 0) && (n &(n-1)) == 0;
        if(!flag){
            return false;
        }
        for(int i = 0;i<32;i+=2){
            if((n & (1 << i)) != 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
    	System.out.println(isPowerOfFour(4));
    }
}
