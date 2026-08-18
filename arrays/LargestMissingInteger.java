public class LargestMissingInteger {
    public int largestInteger(int[] nums, int k) {
        int i = 0;
        int j = k-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        while(j<nums.length){
            missing(nums,i,j,map);
            i++;
            j++;
        }
        
        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                answer = Math.max(answer, entry.getKey());
            }
        }
        
        return answer;
    }
    public void missing(int[] nums, int n, int m, HashMap<Integer,Integer> map) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = n; i <= m; i++) {
            set.add(nums[i]);
        }

        for (int num : set) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
}
