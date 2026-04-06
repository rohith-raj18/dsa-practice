import java.util.*;
public class CheckIfStringArrayEqual{
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res ="";
        for(int i = 0;i<word1.length;i++){
            res += word1[i];
        }
        String ser = "";
        for(int i = 0;i<word2.length;i++){
            ser += word2[i];
        }
        return res.equals(ser);
    }
    public static void main(String[] args){
    	String[] word1 = {"ab","c"};
    	String[] word2 = {"a","bc"};
    	System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
