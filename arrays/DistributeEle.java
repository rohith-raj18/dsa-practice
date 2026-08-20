public class DistributeEle {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] res = new int[nums.length];
        int k = 0;
        int j = 0;
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        for(int i = 2;i<nums.length;i++){
            if(arr1[k] > arr2[j]){
                arr1[++k] = nums[i];
            }else{
                arr2[++j] = nums[i];
            }
        }
        int i = 0;
        int index = 0;
        while(arr1[i] != 0){
            res[index++] = arr1[i++];
        }
        int m = 0;
        while(arr2[m] != 0){
            res[index++] = arr2[m++];
        }
        return res;
    }
}
