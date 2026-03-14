import java.util.*;
public class AllAnagrams{
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];
        int[] nums = new int[26];
        for(char c:p.toCharArray()){
            arr[c-'a']++;
        }
        int j = p.length();
        for(int i = 0;i<s.length();i++){
            nums[s.charAt(i) - 'a']++;
            if(i >= j){
                nums[s.charAt(i-j) - 'a']--;
            }
            if(Arrays.equals(arr,nums)){
                list.add((i-j) +1);
            }
        }
        return list;
    }
    public static void main(String[] args){
    	System.out.println(findAnagrams("cbaebabacd","abc"));
    }
}
