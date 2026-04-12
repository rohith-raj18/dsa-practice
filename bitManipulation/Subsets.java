import java.util.*;
public class Subsets{
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sub = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < (1<<n);i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i&(1<<j)) != 0){
                    list.add(nums[j]);
                }
            }
            sub.add(list);
        }
        return sub;
    }
    public static void main(String[] args){
    	int[] arr = {1,2,3};
    	System.out.println(subsets(arr));
    }
}
