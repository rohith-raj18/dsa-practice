import java.util.*;
public class FindAllDuplicates{
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i] - 1]++;
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i] > 1){
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args){
    	int[] arr = {4,3,2,7,8,2,3,1};
    	System.out.println(findDuplicates(arr));
    }
}	
