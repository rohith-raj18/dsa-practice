public class FindMissing {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
            set.add(i);
        }
        for(int i = min;i<= max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
