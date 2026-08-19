public class TrappingRain {
    public int trap(int[] nums) {
       int lmax = 0;// maintain left max;
       int rmax = 0;// maintain right max;
       int i = 0;
       int j = nums.length-1;
       int water = 0;
       while(i<j){
        if(nums[i] < nums[j]){
            lmax = Math.max(lmax,nums[i]);
            water += lmax - nums[i++];// nums[i] is bar height
        }else{
            rmax = Math.max(rmax,nums[j]);
            water += rmax - nums[j--];// nums[j] is bar height
        }
       }
       return water;
    }
}
