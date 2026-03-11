import java.util.*;
public class LengthOfLast{
	public static int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        return word[word.length - 1].length();
    }
    public static void main(String[] args){
    	System.out.println(lengthOfLastWord("Hello World"));
    }
}
