import java.util.*;
public class BestTimeBuyAndSell {

    public static int buy(int[] arr) {
        int i = arr[0];

        int max = 0;
       for(int j = 1;j<arr.length-1;j++){
           int profit = arr[j] - i;
           max = Math.max(max,profit);
           if(arr[j]< i){
               i = arr[j];
           }
       }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,3,1,3,4,7,1};
        System.out.println(buy(arr));
    }
}
