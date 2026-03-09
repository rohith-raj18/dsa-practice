import java.util.*;
public class CountPairsTarget{
	public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0;i<nums.size();i++){
            for(int j = i+1;j<nums.size();j++){
                if(i<j && nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
    	List<Integer> list = Arrays.asList(-1,1,2,3,1);
    	System.out.println(countPairs(list,2));
    }
}
