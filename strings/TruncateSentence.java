import java.util.*;
public class TruncateSentence{
	public static String truncateSentence(String s, int k) {
        int space = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                space++;
            }
            if(space == k){
                return s.substring(0,i);
            }
        }
        return s;
    }
    public static void main(String[] args){
    	System.out.println(truncateSentence("Hello how are you contestant",4));
    }
}
