import java.util.*;
public class KdiffPairs{
	public static void diff(int[] arr, int k){

        int i = 0;
        int j = 1;
        while(j<arr.length){
            int diff = arr[j] - arr[i];
            if(diff == k){
                System.out.println("["+arr[i] + ","+arr[j]+"]");
                i++;
                j++;
            }else if( diff < k){
                j++;
            }else{
                i++;
            }
            if(i == j){
                j++;
            }
        }



    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        diff(arr,2);
    }
}
