import java.util.*;
public class TrimTrailingVowels{
	public static String trimTrailingVowels(String s) {
        int j = s.length()-1;
        while(j >= 0){
            char c = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                j--;
            }else{
                break;
            }
        }
        return s.substring(0,j+1);
    }
    public static void main(String[] args){
    	System.out.println(trimTrailingVowels("idea"));
    }
}
