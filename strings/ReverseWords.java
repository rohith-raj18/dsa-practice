import java.util.*;
public class ReverseWords{
	 public static String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        int i = 0;
        int j = str.length-1;
        while(i<j){
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;

            i++;
            j--;
        }
        return String.join(" ",str);
    }
	public static void main(String[] args){
		System.out.println(reverseWords("the sky is blue"));
	}
}
