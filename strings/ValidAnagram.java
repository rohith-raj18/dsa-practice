import java.util.*;
public class Practice {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(char c:s.toCharArray()){
            arr[c - 'a']++;
        }
        // here we actually map characters to index(0-25)  using (c-'a') ascii values 
        for(char c: t.toCharArray()){
            arr[c-'a']--;
        }
        for(int count : arr){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("anagram","nagaram"));
     }
}
