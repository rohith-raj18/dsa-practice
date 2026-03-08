import java.util.*;
public class SumOfSquare{
	public static boolean judgeSquareSum(int c) {
       long a = 0;
       long b = (long)Math.sqrt(c);
       while(a<=b){
        long sum = a*a + b*b;
        if(sum == c){
            return true;
        }
        if(sum < c){
            a++;
        }else{
            b--;
        }
       }
       return false;
    }
    public static void main(String[] args){
    	System.out.println(judgeSquareSum(5));
    }
}
