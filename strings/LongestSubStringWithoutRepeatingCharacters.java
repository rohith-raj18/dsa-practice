import java.util.*;
public class LongestSubStringWithoutRepeatingCharacters{
	public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int j = 0;
        int[] arr = new int[128];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)]++;
            while(arr[s.charAt(i)] > 1){
                arr[s.charAt(j)]--;
                j++;
            }
            max = Math.max(max,(i-j)+1);
        }
        return max;
    }
    public static void main(String[] args){
    	System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
