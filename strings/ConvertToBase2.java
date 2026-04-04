import java.util.*;
public class ConvertToBase2{
	public static String baseNeg2(int n) {
        String res = "";
        if(n == 0){
            return "0";
        }
        while(n != 0){
            int rem = n%-2;
            n = n/-2;
            if(rem < 0){
                rem += 2;
                n += 1;
            }
            res += rem;
        }
       return reverse(res);
    }
    public static String reverse(String s){
        char c[] = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
    }
    public static void main(String[] args){
    	System.out.println(baseNeg2(2));
    }
}
