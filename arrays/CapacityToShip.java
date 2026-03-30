
public class CapacityToShip {
    public static int shipWithinDays(int[] nums, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            sum += nums[i];
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low + (high-low)/2;
            int total = req(nums,mid);
            if(total <= days){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int req(int[] nums,int cap){
        int days = 1;
        int load = 0;
        for(int i = 0;i<nums.length;i++){
            if(load + nums[i] > cap){
                days += 1;
                load = nums[i];
            }else{
                load += nums[i];
            }
        }
        return days;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(nums, 5));
     }
}
