import java.util.*;
public class ReverseVowels{
	 public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] c = s.toCharArray();
        while(i<j){
            if(!isVowel(c[i])){
                i++;
            }else if(!isVowel(c[j])){
                j--;
            }else{
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return new String(c);
    }
    public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch); 
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args){
    	System.out.println(reverseVowels("IceCreAm"));
    }
}
