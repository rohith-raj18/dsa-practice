import java.util.*;
public class MergeStringsAlternately{
	public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int k = 0;
        char[] str = new char[word1.length()+word2.length()];
        while(i<word1.length() && j < word2.length()){
            str[k++] = word1.charAt(i++);
            str[k++] = word2.charAt(j++);
        
        }
        while(i<word1.length()){
            str[k++] = word1.charAt(i++);
        }
        while(j<word2.length()){
            str[k++] = word2.charAt(j++);
        }
        return new String(str);
    }
    public static void main(String[] args){
    	System.out.println(mergeAlternately("abc","pqr"));
    }
}
