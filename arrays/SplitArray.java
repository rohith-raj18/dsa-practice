import java.util.*;
public class SplitArray{
	public static boolean isPossibleToSplit(int[] nums) {
        int freq[] = new int[101];
        // for splitting equally there should no element more than 2 for distinct elements 
        // in each array so for optimal take a frequency array and note freq and check 
        // if any element is repeated more than 2 times
        for(int i:nums){
            freq[i]++;
            if(freq[i] > 2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
    	int[] arr = {1,1,2,2,3,3};
    	System.out.println(isPossibleToSplit(arr));
    }
}
