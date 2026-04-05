import java.util.*;
public class FindDisappered{
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i = 1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
    	int[] arr = {4,3,2,7,8,2,3,1};
    	System.out.println(findDisappearedNumbers(arr));
    }
}
