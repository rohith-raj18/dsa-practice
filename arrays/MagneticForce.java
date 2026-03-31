import java.util.*;
public class MagneticForce {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        while(low <= high){
            int mid = low + (high-low)/2;
            if(place(position,mid,m) == true){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return high;
    }
    public static boolean place(int[] nums,int d,int m){
        int count = 1;
        int last = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] - last >= d){
                count++;
                last = nums[i];
            }
            if(count >= m){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,7};
        System.out.println(maxDistance(nums,3));
     }
}
