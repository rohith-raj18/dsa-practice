public class DifferenceArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int j:nums2){
            set2.add(j);
        }
        List<Integer> list1 = new ArrayList<>();
        for(int i:set1){
            if(!set2.contains(i)){
                list1.add(i);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for(int j:set2){
            if(!set1.contains(j)){
                list2.add(j);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
