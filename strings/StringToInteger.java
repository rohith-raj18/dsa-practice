import java.util.*;

public class StringToInteger {
    public static int myAtoi(String s) {
        int i = 0;
        int j = s.length();
        int sign = 1;
        // skip trailing spaces 
        while(i<j && s.charAt(i) == ' '){
            i++;
        }
        
		// handle sign here 
        if(i < j && s.charAt(i) == '+' || s.charAt(i) == '-'){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        long num = 0;
        // if aplhabets appers just return 0
        while(i < j && Character.isDigit(s.charAt(i))){
        
            num = num*10 + (s.charAt(i)- '0');
			// if value is very high probably the max value then return max_value
            if(sign *  num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            // according to sign same as above if negative return min_value;
            if(sign * num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign * num);
    }
    public static void main(String[] args){
        System.out.println(myAtoi("  42"));
     }
}
