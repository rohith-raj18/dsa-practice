import java.util.*;
public class PowerOf2{
	public static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        if((n & (n-1)) == 0){
            return true;
        }
        
        return false;
    }
	public static void main(String[] args){
		System.out.println(isPowerOfTwo(8));
	}
}
