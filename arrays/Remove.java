import java.util.*;

public class Remove {

    public static int remove(int[] arr, int value) {
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= value){
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,0,6,2};
        int k = remove(arr,2);
        for(int i = 0;i<k;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
