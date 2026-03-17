import java.util.*;
public class ValidPerfectSquare{
	 public static boolean isPerfectSquare(int num) {
        long i = 1;
        long j = num;
        while(i<=j){
            long mid = i + (j-i)/2;
            long square = mid*mid;
            if(square == num){
                return true;
            }
            if(square < num){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
            
        }
        return false;
    }
	public static void main(String[] args){
		System.out.println(isPerfectSquare(16));
	}
}
