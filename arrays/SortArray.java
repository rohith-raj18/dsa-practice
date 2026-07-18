public class SortArray {
	// Merge sort	
	
    int b[] = null;
    public int[] sortArray(int[] nums) {
        if(nums == null){
            return null;
        }
        this.b = new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums,int low,int high){
        int mid = low + (high-low)/2;
        if(low < high){
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public void merge(int[] nums,int low,int mid,int high){
        int i = low;
        int j = mid + 1;
        int k = low;
        while(i <= mid && j <= high){
            if(nums[i] < nums[j]){
                b[k++] = nums[i++];
            }else{
                b[k++] = nums[j++];
            }
        }
        while(i <= mid){
            b[k++] = nums[i++];
        }
        while(j<=high){
            b[k++] = nums[j++];
        }
        for(int x = low;x<=high;x++){
            nums[x] = b[x];
        }
    }
}
