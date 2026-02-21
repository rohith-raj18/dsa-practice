import java.util.*;
public class MaxAscendingSubArraySum{
	public static int maxAscendingSum(int[] arr) {
        int sum = arr[0];
        int max = arr[0];

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] > arr[j - 1]) {
                sum += arr[j];      
            } else {
                sum = arr[j];       
            }

            max = Math.max(max, sum); 
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 10, 30, 50};
        System.out.println(maxAscendingSum(arr));
    }
}
