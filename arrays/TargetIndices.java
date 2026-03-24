import java.util.*;

public class TargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int less = 0;

        for(int num : nums){
            if(num == target) count++;
            if(num < target) less++;
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < count; i++){
            list.add(less + i);
        }

        return list;
    }
    public static void main(String[] args){
       int[] arr = {1,2,5,2,3};
        System.out.println(targetIndices(arr,3));
     }
}
