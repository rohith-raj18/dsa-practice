import java.util.*;

public class MaxPointsFromCards{
    public static int maxPoints(int[] arr,int k) {
        int max = 0;
        int lsum = 0;
        int rsum = 0;
        int rindex = arr.length-1;
        for(int i = 0;i<k;i++){
            lsum += arr[i];
        }
        max = lsum;
        for(int i = k-1;i>=0;i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[rindex];
            rindex--;
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1,5,2,7,1,9};
        System.out.println(maxPoints(arr,3));
    }
}
