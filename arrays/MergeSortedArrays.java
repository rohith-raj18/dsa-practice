import java.util.*;
public class MergeSortedArrays {

    public static void merge(int[] arr, int[] nums, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && arr[i] > nums[j]) {
                arr[k--] = arr[i--];
            } else {
                arr[k--] = nums[j--];
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] nums = {2,5,7};
        merge(arr,nums,3,3);
    }
}
