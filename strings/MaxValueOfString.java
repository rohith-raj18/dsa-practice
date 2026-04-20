import java.util.*;
public class MaxValueOfString{
	public static int maximumValue(String[] strs) {
        int max = 0;
        for(String str : strs){
            boolean isNumeric = true;
            for(char c : str.toCharArray()){
                if(!Character.isDigit(c)){
                    isNumeric = false;
                    break;
                }
            }
            int value;
            if(isNumeric){
                value = Integer.parseInt(str);
            }else{
                value = str.length();
            }
            max = Math.max(max,value);
        }
        return max;
    }
    public static void main(String[] args){
    	String[] strs = {"alic3","bob","3","4","00000"};
    	System.out.println(maximumValue(strs));
    }
}
