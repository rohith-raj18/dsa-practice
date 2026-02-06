import java.util.*;
public class Intersection{
	public static int[] intersection(int[] arr,int [] nums){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i:arr) {
            set.add(i);
        }
        for(int j:nums){
            if(set.contains(j)){
                result.add(j);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for(int i: result){
            res[index++] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int[] nums = {2,3,4,4,5,6};
        System.out.println(Arrays.toString(intersection(arr,nums)));
    }
}
