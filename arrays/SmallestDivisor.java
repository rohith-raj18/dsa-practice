public class SmallestDivisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int low = 1;
        int ans  = -1;
        while(low <= max){
            int mid = low + (max - low)/2;
            if(sum(nums,mid) <= threshold){
                ans = mid;
                max = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int sum(int[] nums,int div){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i]/div);
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums = {1,2,5,9};
        System.out.println(smallestDivisor(nums,6));
     }
}
