import java.util.*;
public class IntersectionII {
    public static int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
