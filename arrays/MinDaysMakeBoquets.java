
public class MinDaysMakeBoquets {
    public static int minDays(int[] nums, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        if(m*k > nums.length){
            return -1;
        }
        int i = min;
        int j = max;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(possible(nums,mid,m,k)){
                j = mid -1;
            }else{
                i = mid + 1;
            }

        }
        return i;
    }
    public static boolean possible(int[] nums,int day,int m,int k){
        int count = 0;
        int boq = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] <= day){
                count++;
            }else {
                boq += (count / k);
                count = 0;
            }
        }
        boq += (count/k);
        return boq >= m;
    }
    public static void main(String[] args){
        int[] nums = {7,7,7,7,12,7,7};
        System.out.println(minDays(nums,2,3));
     }
}
