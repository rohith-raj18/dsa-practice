import java.util.*;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0;i<arr.length;i+= 2*k){
            int left = i;
            int right = Math.min(i + k - 1,arr.length-1);
            reverse(arr,left,right);
        }
        return new String(arr);
    }
    public static void reverse(char[] arr,int i,int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args){
        System.out.println(reverseStr("abcdefg",2));
     }
}
