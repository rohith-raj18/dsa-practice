import java.util.*;
public class Perfect{
	public static boolean checkPerfectNumber(int num) {
        int fact = 0;
        for(int i = 1;i<num;i++){
            if(num%i == 0){
                fact += i;
            }
        }
        if(fact == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
    	System.out.println(checkPerfectNumber(6));
    }
}
