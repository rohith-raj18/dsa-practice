import java.util.*;

public class SumOfOddArray {
    public static int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){

            int count = (i+1)*(n-i);
            int total = (count + 1)/2;
            sum += arr[i] * total;
        }
        return sum;
    }
    public static void main(String[] args){
       int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
