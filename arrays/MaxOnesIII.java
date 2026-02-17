import java.util.*;
public class MaxOnesIII{
	public static int longestOnes(int[] arr, int k) {
         int max = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while(j<arr.length){
            if(arr[j] == 0){
                count++;
            }
            while(count > k){
                if(arr[i] == 0){
                    count--;
                }
                i++;
            }
            if(count <= k){
                max = Math.max(max,(j-i)+1);
            }
            j++;

        }
        return max;
    }
    public static void main(String[] args){
    	int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
    	System.out.println(longestOnes(arr,2));
    }
}
