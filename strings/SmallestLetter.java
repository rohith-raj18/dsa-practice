import java.util.*;

public class SmallestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int i = 0;
        int j = letters.length-1;
        while(i<j){
            int mid = i + (j-i)/2;
            if(letters[mid] > target){
                j = mid;
            }
            else{
                i = mid + 1;
            }
        }
        if(letters[i] <= target){
            return letters[0];
        }
        return letters[i];
    }
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'a'));
     }
}
