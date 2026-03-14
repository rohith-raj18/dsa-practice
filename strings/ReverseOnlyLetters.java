import java.util.*;
public class ReverseOnlyLetters{
	 public static String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] str = s.toCharArray();
        while(i<j){
            
            while(i<j &&!Character.isLetter(str[i])){
                i++;
            }
            while(i<j&&!Character.isLetter(str[j])){
                j--;
            }
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }
    public static void main(String[] args){
    	System.out.println(reverseOnlyLetters("ab-cd"));
    }
}
