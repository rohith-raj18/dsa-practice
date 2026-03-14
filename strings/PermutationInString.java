import java.util.*;
public class PermutationInString{
	public static boolean checkInclusion(String s1, String s2) {
        int[] nums = new int[26];
        for(char c : s1.toCharArray()){
            nums[c-'a']++;
        }
        int[] arr = new int[26];
        int j = s1.length();
        for(int k = 0;k<s2.length();k++){
            arr[s2.charAt(k) - 'a']++;
            if(k>=j){
                arr[s2.charAt(k-j) - 'a']--;
            }
            if(Arrays.equals(nums,arr)){
                return true;
            }
        }
       return false;
    }
    public static void main(String[] args){
    	System.out.println(checkInclusion("ab","eidbaooo"));
    }
}
