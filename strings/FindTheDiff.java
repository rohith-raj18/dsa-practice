import java.util.*;
public class FindTheDiff{
	public static char findTheDifference(String s, String t) {
        char result = 0;
        for(char c:s.toCharArray()){
            result ^= c;
        }
        // result = a^b^c^d 
        // next step 
        for(char c:t.toCharArray()){
            result ^= c;
        }
        // result = a^b^c^d^a^b^c^d^e which cancels outs and result = 'e' //
        return result;
    }
	public static void main(String[] args){
		System.out.println(findTheDifference("abcd","abcde"));
	}
}
