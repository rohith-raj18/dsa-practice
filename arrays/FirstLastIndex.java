import java.util.*;
public class FirstLastIndex{
    public static int[] searchRange(int[] arr, int target) {
        int i = 0;
        int j = arr.length-1;
        int first = findFirst(arr,target);
        int last = findLast(arr,target);
        return new int[]{first,last};
	}
        
    
    public static int findFirst(int[] arr,int target){
        int i = 0,j = arr.length-1;
        int ans = -1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(arr[mid] == target){
                ans = mid;
                j = mid -1;
            }else if(arr[mid] < target){
                i = mid+1;
            }else{
                j = mid -1;
            }
        }
        return ans;
    }
    public static int findLast(int[] arr,int target){
        int i = 0,j = arr.length-1;
        int ans = -1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(arr[mid] == target){
                ans = mid;
                i = mid + 1;
            }else if(arr[mid] < target){
                i = mid+1;
            }else{
                j = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,3,5,5,6};
    	System.out.println(Arrays.toString(searchRange(arr,5)));
	}
}
