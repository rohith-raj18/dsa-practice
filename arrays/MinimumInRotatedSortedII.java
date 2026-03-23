public class MinimumInRotatedSortedII {
    public static int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(i<=j){
            int mid = i + (j-i)/2;
            //for duplicates we cannot say whether which portion is sorted shrink j 
            if(nums[mid] == nums[j]){
                min = Math.min(min,nums[mid]);
                j--;
            }else if(nums[mid] > nums[j]){// right half is unsorted so min may exist there
                i = mid + 1;
            }else{// left may exist in the left so 
                min = Math.min(min,nums[mid]);
                j = mid -1;
            }
        }
        return min;
    }
    public static void main(String[] args){
       int[] arr = {3,1,3};
        System.out.println(findMin(arr));
     }
}
